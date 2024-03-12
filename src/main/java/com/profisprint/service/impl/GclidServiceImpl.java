package com.profisprint.service.impl;

import com.profisprint.service.GclidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

@Slf4j
@Service
public class GclidServiceImpl implements GclidService {

    @Override
    public String getGclid() {
        String query = "";

        while (query == null || query.isEmpty()) {
            String redirectUrl = getRedirectUrl2();
            if (redirectUrl.contains("gclid=")) {
                query = redirectUrl.substring(redirectUrl.indexOf("gclid=")+6, redirectUrl.indexOf("gclid=")+98)
                        .replaceAll("\\\\", "")
                        .replaceAll("&", "");
            }
        }
        StringBuilder gclidFields = new StringBuilder("?");

        for (String field : gclidFields()) {
            if (new Random().nextBoolean()) {
                switch (field) {
                    case "utm_source=": {
                        String value = Arrays.asList("gdn", "GDN", "google", "Google", "youtube", "awo").stream().findAny().get();
                        gclidFields.append(field).append(value).append("&");
                    } break;
                    case "utm_medium=": {
                        String value = Arrays.asList("cpc", "cpm", "trueview", "banner", "display").stream().findAny().get();
                        gclidFields.append(field).append(value).append("&");
                    } break;
                    case "utm_content=": {
                        String value = Arrays.asList("youtube", "google").stream().findAny().get();
                        gclidFields.append(field).append(value).append("&");
                    } break;
                    case "utm_phase=": {
                        gclidFields.append(field).append(String.valueOf(new Random().nextInt(999999999))).append("&");
                    } break;
                    case "utm_campaign=": {
                        gclidFields.append(field).append(String.valueOf(new Random().nextInt(999999999))).append("&");
                    } break;

                    default: {
                        gclidFields.append(field).append("&");
                    }
                }

            }
        }

        return gclidFields.toString()+"gclid="+query;
    }

//    @Override
//    public String getRedirectUrl() {
//        String redirectUrl = "";
//        try {
//            StringBuilder content = new StringBuilder();
//            ArrayList<String> urls = new ArrayList<>();
////            urls.add("https://googleads.g.doubleclick.net/pagead/ads?client=ca-pub-3755662197386269&output=html&h=90&slotname=4650414344&adk=2938419949&adf=2751417936&pi=t.ma~as.4650414344&w=728&psa=1&format=728x90&url=https%3A%2F%2Fwww.bigmir.net%2F&ea=0&flash=0&wgl=1&uach=WyJXaW5kb3dzIiwiMTAuMC4wIiwieDg2IiwiIiwiOTUuMC40NjM4LjY5IixbXSxudWxsLG51bGwsIjY0Il0.&dt=1638014358905&bpp=10&bdt=127&idt=50&shv=r20211111&mjsv=m202111110101&ptt=9&saldr=aa&cookie=ID%3D00759a6af01232c2-22f0179002cc005b%3AT%3D1638014316%3ART%3D1638014316%3AS%3DALNI_MbQoLYS4Ka8ow3567nrFX6EU9eoUg&correlator=2421990979099&frm=23&ife=5&pv=1&ga_vid=2004021970.1638014313&ga_sid=1638014359&ga_hid=1854169710&ga_fc=1&nhd=1&u_tz=120&u_his=3&u_h=1080&u_w=1920&u_ah=1080&u_aw=1858&u_cd=24&dmc=8&adx=367&ady=0&biw=1461&bih=1010&isw=728&ish=90&ifk=3768487098&scr_x=0&scr_y=0&oid=2&pvsid=2950265974703419&pem=33&tmod=252376214&eae=2&fc=896&brdim=0%2C0%2C0%2C0%2C1858%2C0%2C1858%2C1080%2C728%2C90&vis=1&rsz=%7C%7CE%7C&abl=CS&pfx=0&fu=4&bc=31&ifi=1&uci=1.ifz87by1r7yv&fsb=1&dtd=72");
//            urls.add("https://googleads.g.doubleclick.net/pagead/ads?gdpr=0&client=ca-pub-2942876710357394&output=html&h=250&slotname=6774540725&adk=3217218781&adf=1248599740&pi=t.ma~as.6774540725&w=300&lmt=1706921732&format=300x250&url=https%3A%2F%2Fsinoptik.ua%2F%25D0%25BF%25D0%25BE%25D0%25B3%25D0%25BE%25D0%25B4%25D0%25B0-%25D0%25BA%25D0%25B8%25D0%25B5%25D0%25B2%2F10-%25D0%25B4%25D0%25BD%25D0%25B5%25D0%25B9&wgl=1&uach=WyJXaW5kb3dzIiwiMTAuMC4wIiwieDg2IiwiIiwiMTA2LjAuNDk5OC42NiIsbnVsbCwwLG51bGwsIjY0IixbWyJOb3RfQSBCcmFuZCIsIjguMC4wLjAiXSxbIkNocm9taXVtIiwiMTIwLjAuNjA5OS4yNjgiXSxbIk9wZXJhIiwiMTA2LjAuNDk5OC42NiJdXSwwXQ..&dt=1706921732327&bpp=1&bdt=1095&idt=521&shv=r20240131&mjsv=m202401290101&ptt=9&saldr=aa&abxe=1&prev_fmts=0x0%2C300x250&nras=1&correlator=35339231195&frm=20&pv=1&ga_vid=843064988.1706921732&ga_sid=1706921733&ga_hid=1171837581&ga_fc=1&u_tz=120&u_his=4&u_h=1080&u_w=1920&u_ah=1080&u_aw=1858&u_cd=24&u_sd=1&dmc=8&adx=772&ady=833&biw=1841&bih=996&scr_x=0&scr_y=0&eid=44759875%2C44759926%2C31080779%2C95322183%2C95324155%2C95324160&oid=2&pvsid=1438044711857573&tmod=1702570878&uas=0&nvt=1&fc=1920&brdim=1920%2C0%2C1920%2C0%2C1858%2C0%2C1858%2C1080%2C1856%2C996&vis=1&rsz=%7C%7CleE%7C&abl=CS&pfx=0&fu=0&bc=31&bz=1&psd=W251bGwsbnVsbCxudWxsLDNd&ifi=3&uci=a!3&fsb=1&dtd=544");
//            Collections.shuffle(urls);
//            URL url = new URL(urls.get(0));
//            URLConnection conn = url.openConnection();
//            conn.setRequestProperty("Cookie", "ar_debug=1; IDE=AHWqTUngFQbCXOgP-pPVOS-FrwKcQreCaqA1TcTvplJLFcbx1YMKhUQIuDhoITHwUc0; DSID=ANfR7bM9wZz_kSwWchw8JCNn_8sZ046czUsZ1jH_DWXWhLwV_gCZQAUlWQrBcxbLQth8-WvpMHku7JDNYrHZlcD8M53jZKFn147A3r6wzDv2BJBFisDJwt2IbBXBGU70UEdrCyJ4wj4hNQC1PV5dAp_c-DOcD9kFww_jKF9pRuhgEnQPU_UCXy8DmjqUg406CpDHBxLRbynjsj4C6spE9eIctQN5FPxtF_geq_d_IsDXGGVyMJO2O6aERvQ7T3s6ZHLh2g8r24pq0fs6Vfj2LCgO_WM8BX4tQJT5u1Az4ROJfvQ9nfNFajk");
//
//            // open the stream and put it into BufferedReader
//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream()));
//            String inputLine;
//            while ((inputLine = br.readLine()) != null) {
//                content.append(inputLine + "\n");
//            }
//            System.out.println(content);
//            String substring1 = content.substring(content.indexOf("<a id=\"aw0\" target=\"_top\" href=\"") + 32);
//            redirectUrl = substring1.substring(0, substring1.indexOf("\""));
//            br.close();
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return redirectUrl;
//    }

    @Override
    public String getRedirectUrl2() {
        String redirectUrl = "";
        try {
            StringBuilder content = new StringBuilder();
            ArrayList<String> urls = new ArrayList<>();
//            urls.add("https://googleads.g.doubleclick.net/pagead/ads?client=ca-pub-3755662197386269&output=html&h=90&slotname=4650414344&adk=2938419949&adf=2751417936&pi=t.ma~as.4650414344&w=728&psa=1&format=728x90&url=https%3A%2F%2Fwww.bigmir.net%2F&ea=0&flash=0&wgl=1&uach=WyJXaW5kb3dzIiwiMTAuMC4wIiwieDg2IiwiIiwiOTUuMC40NjM4LjY5IixbXSxudWxsLG51bGwsIjY0Il0.&dt=1638014358905&bpp=10&bdt=127&idt=50&shv=r20211111&mjsv=m202111110101&ptt=9&saldr=aa&cookie=ID%3D00759a6af01232c2-22f0179002cc005b%3AT%3D1638014316%3ART%3D1638014316%3AS%3DALNI_MbQoLYS4Ka8ow3567nrFX6EU9eoUg&correlator=2421990979099&frm=23&ife=5&pv=1&ga_vid=2004021970.1638014313&ga_sid=1638014359&ga_hid=1854169710&ga_fc=1&nhd=1&u_tz=120&u_his=3&u_h=1080&u_w=1920&u_ah=1080&u_aw=1858&u_cd=24&dmc=8&adx=367&ady=0&biw=1461&bih=1010&isw=728&ish=90&ifk=3768487098&scr_x=0&scr_y=0&oid=2&pvsid=2950265974703419&pem=33&tmod=252376214&eae=2&fc=896&brdim=0%2C0%2C0%2C0%2C1858%2C0%2C1858%2C1080%2C728%2C90&vis=1&rsz=%7C%7CE%7C&abl=CS&pfx=0&fu=4&bc=31&ifi=1&uci=1.ifz87by1r7yv&fsb=1&dtd=72");
            urls.add("https://googleads.g.doubleclick.net/pagead/ads?gdpr=0&client=ca-pub-2942876710357394&output=html&h=250&slotname=6774540725&adk=3217218781&adf=1248599740&pi=t.ma~as.6774540725&w=300&lmt=1706921732&format=300x250&url=https%3A%2F%2Fsinoptik.ua%2F%25D0%25BF%25D0%25BE%25D0%25B3%25D0%25BE%25D0%25B4%25D0%25B0-%25D0%25BA%25D0%25B8%25D0%25B5%25D0%25B2%2F10-%25D0%25B4%25D0%25BD%25D0%25B5%25D0%25B9&wgl=1&uach=WyJXaW5kb3dzIiwiMTAuMC4wIiwieDg2IiwiIiwiMTA2LjAuNDk5OC42NiIsbnVsbCwwLG51bGwsIjY0IixbWyJOb3RfQSBCcmFuZCIsIjguMC4wLjAiXSxbIkNocm9taXVtIiwiMTIwLjAuNjA5OS4yNjgiXSxbIk9wZXJhIiwiMTA2LjAuNDk5OC42NiJdXSwwXQ..&dt=1706921732327&bpp=1&bdt=1095&idt=521&shv=r20240131&mjsv=m202401290101&ptt=9&saldr=aa&abxe=1&prev_fmts=0x0%2C300x250&nras=1&correlator=35339231195&frm=20&pv=1&ga_vid=843064988.1706921732&ga_sid=1706921733&ga_hid=1171837581&ga_fc=1&u_tz=120&u_his=4&u_h=1080&u_w=1920&u_ah=1080&u_aw=1858&u_cd=24&u_sd=1&dmc=8&adx=772&ady=833&biw=1841&bih=996&scr_x=0&scr_y=0&eid=44759875%2C44759926%2C31080779%2C95322183%2C95324155%2C95324160&oid=2&pvsid=1438044711857573&tmod=1702570878&uas=0&nvt=1&fc=1920&brdim=1920%2C0%2C1920%2C0%2C1858%2C0%2C1858%2C1080%2C1856%2C996&vis=1&rsz=%7C%7CleE%7C&abl=CS&pfx=0&fu=0&bc=31&bz=1&psd=W251bGwsbnVsbCxudWxsLDNd&ifi=3&uci=a!3&fsb=1&dtd=544");
            Collections.shuffle(urls);
            URL url = new URL(urls.get(0));
            URLConnection conn = url.openConnection();
//            conn.setRequestProperty("Cookie", "ar_debug=1; IDE=AHWqTUmVQ9rXZlMp44TffMa38BSGi4msTcBKC6298MnAh-kNFrDnh-xtXmb14pWLZ4M; receive-cookie-deprecation=1; DSID=ANfR7bPGTPEUByzBJuSbp0NQf_N9qRd43yyJI4QW85a5rGaF1ZBWaJzWkKVBlQ9oep0Hjld0rj2DXAuW6729svpCkMFrnaTa-kj3F-hdj81HzWssm53X4HhVwBGGzZbVCuyDyEcjVN7lK5J77As5uI5RZVruBMVWPFO_peAn082IGCqS39YjN09M1i33g9IvIQ1x93GtAkcB0CG8qiJR0sf1Fd9sDGWlmRkpmiNUWAAFKi1IXgN0O0lqdVu2qwtsqJRTdxOGP-svVNHNBm5TczVGlEBRY-gFi2jSwnxZBL7NT18kLeZ1L3Y");
//            conn.setRequestProperty("Cookie", "ar_debug=1; DSID=ANfR7bMijFIVDbNI6B7yBHCIA2JOGDGo6uCSYtkcd8CQuY0l0nDd-vyQlqsxZ6tJCdPRYN_yeMN6A1IBiDGNE14PrlgL-wu6yXDPCAJBtyyg7_phniAIt0Ml8mf_bx2e3NlqDwjYnCuuEmsNgdDwPrg7B6ExzukoCXUh5-cNxPZCK--sefAASauzUh4nMKjJ7mE2rSTLLfCxXnTS0Trmue7AdiUXtj9PQwsWrfoeifYUMyF8VoPmrE-TQdfGLNEjkFlR_mGdoxD7UcexXWHeOi6-GsaF0bvVHmOKxjiHlOGtfYwVWzqMgmk; IDE=AHWqTUl9TiIuZozkARRyMcLwMEPoW2wZlsmvesp5-HjZ6Jm2uOTOQHT76AmXUpVBjwk");
            conn.setRequestProperty("Cookie", "ar_debug=1; IDE=AHWqTUngFQbCXOgP-pPVOS-FrwKcQreCaqA1TcTvplJLFcbx1YMKhUQIuDhoITHwUc0; DSID=ANfR7bM9wZz_kSwWchw8JCNn_8sZ046czUsZ1jH_DWXWhLwV_gCZQAUlWQrBcxbLQth8-WvpMHku7JDNYrHZlcD8M53jZKFn147A3r6wzDv2BJBFisDJwt2IbBXBGU70UEdrCyJ4wj4hNQC1PV5dAp_c-DOcD9kFww_jKF9pRuhgEnQPU_UCXy8DmjqUg406CpDHBxLRbynjsj4C6spE9eIctQN5FPxtF_geq_d_IsDXGGVyMJO2O6aERvQ7T3s6ZHLh2g8r24pq0fs6Vfj2LCgO_WM8BX4tQJT5u1Az4ROJfvQ9nfNFajk");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                content.append(inputLine + "\n");
            }
            System.out.println(content);
            if (content.indexOf("gclid=") != -1) {
                redirectUrl = content.substring(content.indexOf("gclid="), content.indexOf("gclid=")+98);
            }
            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return redirectUrl;
    }

    @Override
    public String getQuery(String redirectUrl) {
        String query = "";
        try {
//            String a="https://googleads.g.doubleclick.net/pagead/ads?client=ca-pub-2783044520727903&output=html&h=250&slotname=5375124397&adk=2419448805&adf=1842636954&w=300&loeid=38893311&url=http%3A%2F%2Fwww.jqueryscript.net%2F&ea=0&flash=0&wgl=1&adsid=NT&dt=1511261983354&bpp=59&bdt=175&fdt=318&idt=350&shv=r20171113&cbv=r20170110&saldr=sa&correlator=3271859956741&frm=24&ga_vid=1316891360.1511261984&ga_sid=1511261984&ga_hid=725781493&ga_fc=0&pv=2&iag=12&icsg=0&nhd=2&dssz=2&mdo=0&mso=0&u_tz=120&u_his=6&u_java=0&u_h=1080&u_w=1920&u_ah=1080&u_aw=1858&u_cd=24&u_nplug=4&u_nmime=5";
//            String a="https://googleads.g.doubleclick.net/aclk?sa=l&ai=Ce80zH8gmYd7OHMfF7gPo4Ih4_P2-yF6f0MT_5g3a2R4QASD-yZskYKWuo4b8IqABy8Hs4gPIAQOpAqrTfmSsF2Q-qAMByAPJBKoE4wFP0FG7v0rOGUFuofRltdti1sUb00eXIV0RCE-vHLrbDRVAZU4lpgG8qh-UmFjPy3HHFTrVLKt9MWPEESr10jUgApFpzDdrwLY2JGuMRWVCUXZXewq3csyzVf4UK3QNijZ6-PojfgdeXg2M7NggWZy77K1rNmU5hWuTZXQMlcLIuuDn5dOLzKDCE_tZOxHNrUFZ_B3pCgxWVTmiX4aNZgAEWkjUwC4ZhVQaxnt1zm0GmylBPO3pbhO5Zs5l0TON6-79HurCgablwLfonaI6hvrhKtfAHfhlvzKpp710yEmnLGdwGsAEhey8pIkDoAYDgAedvpMdqAfVyRuoB_DZG6gH8tkbqAeOzhuoB5PYG6gHugaoB-6WsQKoB6a-G6gH7NUbqAfz0RuoB-zVG6gHltgbqAeqm7ECqAffn7EC2AcB0ggHCIBhEAEYH7EJvGUtMRFoZKSACgGYCwHICwG4DAHYEw3QFQGAFwE&num=1&sig=AOD64_1sQvRWsw5EidiPyg2cGfMaILeJTQ&client=ca-pub-2783044520727903&adurl=https://www.automir.com.ua/novi-avto/kupyt-volkswagen-tiguan-elegance-2-0-tsi-220-k-s";
//            redirectUrl = "https://googleads.g.doubleclick.net/aclk?sa=l&ai=CVriqwEOhYZflHti2YvqJp_gPl8fXn2Tm_Maw4Q6igKfRrA4QASD-yZskYKWuo4b8IqABxsH-kwPIAQKoAwHIA8kEqgTyAU_Q8yBaFHMSvXA47RP0b40B1OxRGZHtp_16nv1Sn77YxE9kgZD2g3yXYTcalGEaL8Un_h-TjPM8PF-WvH6JcI8079w6p5AmreF0u034VW_-rAewqw6rWj6Pj3sPKZoNcwfE2QyAozKfkeUt8pMH0-1PRg3DOrSbpTVVlMm4vMmIwI8QOHrFeHTmJwQOEVKGLgjn0LAL8uN0hMGDsE8YRBHTsQHD4GVqvK2YZHA_vUE68k1_SgbmfvKSsu_qdzG9Dw8oYgqX2J2Jr-Y9g9NhcXY-pUKjqIf_iPTj4i_RhTzAcFMY3TVg56-2BYodqDLveQK8wASrjqfo3gOgBgKAB6K-gWyoB47OG6gHk9gbqAfulrECqAf-nrECqAfVyRuoB6a-G6gH89EbqAeW2BuoB6qbsQKoB9-fsQLYBwHSCAcIgGEQARhfgAoBmAsByAsBuAwB2BMN0BUBmBYBgBcB&num=1&sig=AOD64_0B2-aO3AOfsjT5p6WFyCqnvwDEaA&client=ca-pub-2783044520727903&adurl=http://%3Fcp%3D-.cid-.agid-.tgid-.intgeo-.phgeo-.ngr-.devt-c.devm-.gcid-%7Bgclid%7D.adId-0.pt-_pt.ptc-.-";

            URL url = new URL(redirectUrl);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            query = conn.getURL().getQuery();
            System.out.println(query);
            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return query;
    }

    public static HashSet<String> gclidFields() {
        HashSet<String> fields = new HashSet<>();
        fields.add("utm_source=");
        fields.add("utm_medium=");
        fields.add("utm_content=");
        fields.add("utm_phase=");
        fields.add("utm_campaign=");
        return fields;
    }
}
