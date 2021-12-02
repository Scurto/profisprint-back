package com.profisprint.service.impl;

import com.profisprint.service.ProfitcentrService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

@Slf4j
@Service
public class ProfitcentrServiceImpl implements ProfitcentrService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void test() {


//        String url = "https://profitcentr.com/work-task";
//        HttpHeaders headers = new HttpHeaders();

//        many times by youtube
//        headers.set("Cookie", "PHPSESSID=3l5v60sgt6p8fls323dia11qe5; _ym_d=1636399001; _ym_uid=1636399001736919284; hostname_sf=seo-fast.ru; _ym_visarc_4246883123=e1906acab58b34a90c17f1a4589ba89a; _buzz_fpc_=feaf02bebbfe7071c1c07e768565ebc2; _ym_visarc_4246983123=6068f2ea23164b07611c6b805e5e9dca; _ym_visarc_42461083123=1dcc84c87e103319e323255d3b3c2a6c; _vid_t=jsxgWSd3uIZZrIkWuMoCuBfqVRgVgbqrLdJXUjDMDGr5V0DV6zrJLN5SsTZ4/WzY1Gw39gVY3utdDmvumcU974pPTA==; _ym_visarc_42461183123=3c9c8837f83d596a4d2b922ea889d8d9; _ym_visarc_42461283123=7cec376c5d0e23521bc05042fa3833d5; _ga=GA1.2.883346684.1636718451; _gid=GA1.2.1614223963.1636718452; _ym_visarc_42461383123=147493c0bbbe1a645987598c64b98bf8; _ym_visarc_42461483123=0d5f7ed877efcf75c2f65a5417432fc5; _ym_visarc_42461583123=7a2ae8b2040f207d4bdef4d6cbd12e3e; _ym_visarc_42461683123=961f06b63cab4d02b44fe11db97f4dfe; _ym_visarc_42461783123=855bddc757279350f0ebb35b9011fc4f; _ym_visarc_42461883123=18f835bc376f73224c96e744c8e8bc54; _ym_visarc_42461983123=c7686af9bb003ea48390a91a1520b84c; _ym_visarc_42462083123=62ac5c9f2e435bf33136e27f3600d813; menu_g1=0; _ym_visarc_42462183123=65923c2b541a9167c025899a9e2502f2; _ym_visarc_42462283123=d66426b9fe5428f6083e20fc4a7fcfb6; _ym_visarc_42462383123=1161804a567dde02c91990b533dd5726; _ym_visarc_42462483123=0c60c479c5bbf781940a8033ebf4289a; window_popup3=1; _ym_visarc_42462583123=76c4606eee731bd0e76296bbd0ac1e0b; _ym_visarc_42462683123=4212071a7a3a58807355c95ca53809a1; window_popup_25=1; _ym_visarc_42462783123=92b794122ad9213b4353c1f339de4922; _ym_visarc_42462883123=c027cff4e53b0cb683d1d2d621c07eaf; taskfilter3=100; taskfilter4=100; id_us_t=; taskurl=; search_all_tt=; _ym_visarc_42462983123=22f596acedc5d2987286957054fb8ea1; fingerprint=f3a236d53eee648883f5f3864d28c8b2; id_task=; due_date=0; search_all_td=0; taskpricemax=0; taskpricemin=0; taskfilter1=98; taskfilter2=17; evercookie_cache=09255f52641471a340d1db7a29a3b006; evercookie_etag=09255f52641471a340d1db7a29a3b006; evercookie_png=09255f52641471a340d1db7a29a3b006; entrance=09255f52641471a340d1db7a29a3b006; window_popup_y=1; _ym_visarc_42463083123=302217cfd1ce4430a9bacfae59e75e15; _ym_isad=1; taskuser=; __gads=ID=65ee2bb6fefafe20-22137c0513cc0050:T=1636399001:RT=1638269094:S=ALNI_MY0_lvxkduJ8gqP_6bSHHTgYIfJZQ");
//        favorites by youtube
//        headers.set("Cookie", "PHPSESSID=3l5v60sgt6p8fls323dia11qe5; _ym_d=1636399001; _ym_uid=1636399001736919284; hostname_sf=seo-fast.ru; _ym_visarc_4246883123=e1906acab58b34a90c17f1a4589ba89a; _buzz_fpc_=feaf02bebbfe7071c1c07e768565ebc2; _ym_visarc_4246983123=6068f2ea23164b07611c6b805e5e9dca; _ym_visarc_42461083123=1dcc84c87e103319e323255d3b3c2a6c; _vid_t=jsxgWSd3uIZZrIkWuMoCuBfqVRgVgbqrLdJXUjDMDGr5V0DV6zrJLN5SsTZ4/WzY1Gw39gVY3utdDmvumcU974pPTA==; _ym_visarc_42461183123=3c9c8837f83d596a4d2b922ea889d8d9; _ym_visarc_42461283123=7cec376c5d0e23521bc05042fa3833d5; _ga=GA1.2.883346684.1636718451; _gid=GA1.2.1614223963.1636718452; _ym_visarc_42461383123=147493c0bbbe1a645987598c64b98bf8; _ym_visarc_42461483123=0d5f7ed877efcf75c2f65a5417432fc5; _ym_visarc_42461583123=7a2ae8b2040f207d4bdef4d6cbd12e3e; _ym_visarc_42461683123=961f06b63cab4d02b44fe11db97f4dfe; _ym_visarc_42461783123=855bddc757279350f0ebb35b9011fc4f; _ym_visarc_42461883123=18f835bc376f73224c96e744c8e8bc54; _ym_visarc_42461983123=c7686af9bb003ea48390a91a1520b84c; _ym_visarc_42462083123=62ac5c9f2e435bf33136e27f3600d813; menu_g1=0; _ym_visarc_42462183123=65923c2b541a9167c025899a9e2502f2; _ym_visarc_42462283123=d66426b9fe5428f6083e20fc4a7fcfb6; _ym_visarc_42462383123=1161804a567dde02c91990b533dd5726; _ym_visarc_42462483123=0c60c479c5bbf781940a8033ebf4289a; window_popup3=1; _ym_visarc_42462583123=76c4606eee731bd0e76296bbd0ac1e0b; _ym_visarc_42462683123=4212071a7a3a58807355c95ca53809a1; window_popup_25=1; _ym_visarc_42462783123=92b794122ad9213b4353c1f339de4922; _ym_visarc_42462883123=c027cff4e53b0cb683d1d2d621c07eaf; taskfilter3=100; taskurl=; id_us_t=; taskfilter4=100; search_all_tt=; _ym_visarc_42462983123=22f596acedc5d2987286957054fb8ea1; fingerprint=f3a236d53eee648883f5f3864d28c8b2; id_task=; due_date=0; taskpricemin=0; taskpricemax=0; search_all_td=0; taskfilter2=17; evercookie_cache=09255f52641471a340d1db7a29a3b006; evercookie_etag=09255f52641471a340d1db7a29a3b006; evercookie_png=09255f52641471a340d1db7a29a3b006; entrance=09255f52641471a340d1db7a29a3b006; window_popup_y=1; _ym_visarc_42463083123=302217cfd1ce4430a9bacfae59e75e15; _ym_isad=1; taskuser=; __gads=ID=65ee2bb6fefafe20-22137c0513cc0050:T=1636399001:RT=1638269094:S=ALNI_MY0_lvxkduJ8gqP_6bSHHTgYIfJZQ; taskfilter1=96");
//        on check by youtube
//        headers.set("Cookie", "_ym_uid=1630042077394355451; _ym_d=1630042077; vblock1=1; SESSIONID=nh03q461h3vg2fk8681orac87l; sort_task_5=16; sort_task_1=0; toschat=yes; sort_task_3=0; viewtask=812650; sort_task_2=0; io=tprJpOBQI2AqUni9KIqf; newprov_etag=ac3916f9265a6e1c9766b55d2b9afbe6; newprov_cache=ac3916f9265a6e1c9766b55d2b9afbe6; newprov_png=ac3916f9265a6e1c9766b55d2b9afbe6; menu_ref=ac3916f9265a6e1c9766b55d2b9afbe6");


//        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//
//        System.out.println(response);

        String file ="D:/Cookies";

//        File myObj = new File(file);
//        if (myObj.exists()) {
//            System.out.println("File name: " + myObj.getName());
//            System.out.println("Absolute path: " + myObj.getAbsolutePath());
//            System.out.println("Writeable: " + myObj.canWrite());
//            System.out.println("Readable " + myObj.canRead());
//            System.out.println("File size in bytes " + myObj.length());
//        } else {
//            System.out.println("The file does not exist.");
//        }
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String st;
//            while ((st = br.readLine()) != null) {
//                System.out.println(st);
//            }
//        } catch (Exception ex) {
//            System.out.println("ex");
//        }

    }
}
