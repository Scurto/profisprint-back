package com.profisprint.storage;

import com.profisprint.model.advertise.AdvertiseModel;
import com.profisprint.model.advertise.SecondaryAdvertiseModel;

import java.util.HashMap;
import java.util.List;

public class AdvertiseDataInfo {

    public static HashMap<String, AdvertiseModel> advertiseData() {
        HashMap<String, AdvertiseModel> advertises = new HashMap<>();
        advertises.put("poly.in.ua", model(
                "https://poly.in.ua",
                "poly.in.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://poly.in.ua/about_us", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/g94667545-audi", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/g94667540-bmw", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/g94667527-ford", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/delivery_info", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/return_policy", ""),
                        new SecondaryAdvertiseModel("https://poly.in.ua/cp97238-partnerskie-usloviya.html", "")
                ))
        );

        advertises.put("louprice.com.ua", model(
                "https://louprice.com.ua/hot/",
                "louprice.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://louprice.com.ua/catalog/?cat=1", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/about/", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/delivery/", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/catalog/?cat=5", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/catalog/?cat=6", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/contacts/", ""),
                        new SecondaryAdvertiseModel("https://louprice.com.ua/privacy/", "")
                ))
        );

        advertises.put("usain.ua", model(
                "https://usain.ua/ua",
                "usain.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://usain.ua/ua/pages/commerce", ""),
                        new SecondaryAdvertiseModel("https://usain.ua/ua/pages/entityua", ""),
                        new SecondaryAdvertiseModel("https://usain.ua/ua/pages/parts", ""),
                        new SecondaryAdvertiseModel("https://usain.ua/ua/ebay/", ""),
                        new SecondaryAdvertiseModel("https://usain.ua/ua/amazon/", ""),
                        new SecondaryAdvertiseModel("https://usain.ua/ua/6pm/", "")
                ))
        );

        advertises.put("monety.com.ua", model(
                "https://monety.com.ua/ua/",
                "monety.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/zoloti-moneti-2", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/platina-paladij", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/sribni-moneti-2", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/nedorogocinni-2", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/podarunki", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/inshe", ""),
                        new SecondaryAdvertiseModel("https://monety.com.ua/ua/moneti-inshih-epoh-2", "")
                ))
        );

        advertises.put("pik-agency.com.ua", model(
                "https://pik-agency.com.ua/prodazha-kvartir",
                "pik-agency.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/kupiti-kvartiru-v-kiyevi", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/sdat-kvartiru-v-arendu", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/otsinka-neruhomosti", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/yuridichni-poslugi", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/sales", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/nedvizhimost-kieva", ""),
                        new SecondaryAdvertiseModel("https://pik-agency.com.ua/buyers", "")
                ))
        );

        advertises.put("sobakendovolen.com.ua", model(
                "https://sobakendovolen.com.ua/gruming/",
                "sobakendovolen.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/mini-gotel/", ""),
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/prajs/", ""),
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/galereya/", ""),
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/otzyvy/", ""),
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/trimming/", ""),
                        new SecondaryAdvertiseModel("https://sobakendovolen.com.ua/kontakty/", "")
                ))
        );

        advertises.put("dnipro-m.ua", model(
                "https://dnipro-m.ua/franchise/",
                "dnipro-m.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/novynky/", ""),
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/sale/", ""),
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/outlet/", ""),
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/shops/", ""),
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/dostavka-i-oplata/", ""),
                        new SecondaryAdvertiseModel("https://dnipro-m.ua/comments/", "")
                ))
        );

        advertises.put("hyundai-auto.com.ua", model(
                "https://hyundai-auto.com.ua/",
                "hyundai-auto.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/all-models/", ""),
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/specialoffers-auto/", ""),
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/hyundai-finance/", ""),
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/korporatyvni-prodazhi-auto/", ""),
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/leasing-auto/", ""),
                        new SecondaryAdvertiseModel("https://hyundai-auto.com.ua/trade-in-auto/", "")
                ))
        );

        advertises.put("instytut-zoru.com", model(
                "https://instytut-zoru.com/",
                "instytut-zoru.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/category/korysni-materialy/", ""),
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/glaukoma/", ""),
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/katarakta-ta-prychyny-yiyi-rozvytku/", ""),
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/shcho-take-lazerna-koahulyatsiya-sitkivky/", ""),
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/yachmen-prichiny-i-metody-lecheniye/", ""),
                        new SecondaryAdvertiseModel("https://instytut-zoru.com/diabet-i-zir/", "")
                ))
        );

        advertises.put("taxi-808.in.ua", model(
                "https://taxi-808.in.ua/uk/",
                "taxi-808.in.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/taxi-with-child-seat/", ""),
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/kurerskaya-dostavka/", ""),
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/trezvyj-voditel/", ""),
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/taxi-v-aeroport/", ""),
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/predvaritelnyj-zakaz-taxi/", ""),
                        new SecondaryAdvertiseModel("https://taxi-808.in.ua/uk/uslugi/perevozka-malogabaritnyh-gruzov/", "")
                ))
        );

        advertises.put("tabletki.ua", model(
                "https://tabletki.ua/uk/pharmacy/kiev/",
                "tabletki.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/payments-and-deliveries/", ""),
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/purchase-returns/", ""),
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/about/contacts/", ""),
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/feedback/", ""),
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/defectivegoods/", ""),
                        new SecondaryAdvertiseModel("https://tabletki.ua/uk/about/company/", "")
                ))
        );

        advertises.put("invest.mountain-residence.com", model(
                "https://invest.mountain-residence.com/",
                "invest.mountain-residence.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/contacts/", ""),
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/news/", ""),
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/progress/", ""),
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/management-company/", ""),
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/investors/", ""),
                        new SecondaryAdvertiseModel("https://invest.mountain-residence.com/about-developer/", "")
                ))
        );

        advertises.put("ce-tvoe.com.ua", model(
                "https://ce-tvoe.com.ua/sell-out/",
                "ce-tvoe.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/oplata-i-dostavka/", ""),
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/garantiya/", ""),
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/kontakty/", ""),
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/obmen-vozvrat/", ""),
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/krasota-i-zdorove/", ""),
                        new SecondaryAdvertiseModel("https://ce-tvoe.com.ua/tovary-dlya-detey/", "")
                ))
        );

        advertises.put("sheriff.com.ua", model(
                "https://sheriff.com.ua/uk/promo",
                "sheriff.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/services", ""),
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/payment", ""),
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/news", ""),
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/blog", ""),
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/publichnuy-dogovir", ""),
                        new SecondaryAdvertiseModel("https://sheriff.com.ua/uk/contacts", "")
                ))
        );

        advertises.put("hbmedical.com.ua", model(
                "https://hbmedical.com.ua",
                "hbmedical.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/pro-nas/", ""),
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/likari/", ""),
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/patsiyentam/", ""),
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/vidguky/", ""),
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/partnery/", ""),
                        new SecondaryAdvertiseModel("https://hbmedical.com.ua/pytannya-vidpovidi/", "")
                ))
        );

        advertises.put("www.boschservice.kiev.ua", model(
                "https://www.boschservice.kiev.ua/remont-i-diagnostika-hodovoy.htm",
                "www.boschservice.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/remont-elektromobilej/", ""),
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/remont-avtokondicionerov.htm", ""),
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/chistka-sazhevyh-filtrov/", ""),
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/remont-turbin/", ""),
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/akvablasting/", ""),
                        new SecondaryAdvertiseModel("https://www.boschservice.kiev.ua/remont-tormoznyh-supportov/", "")
                ))
        );

        advertises.put("ua.tatragarden.ua", model(
                "https://ua.tatragarden.ua/fs-action",
                "ua.tatragarden.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/cepnye-pily", ""),
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/kosy", ""),
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/gazonokosilki", ""),
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/kultivatory", ""),
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/generatory", ""),
                        new SecondaryAdvertiseModel("https://ua.tatragarden.ua/moyki-i-aksessuary", "")
                ))
        );

        advertises.put("allo.ua", model(
                "https://allo.ua/ua/events-and-discounts/",
                "allo.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://allo.ua/ua/help/shipment_payment/", ""),
                        new SecondaryAdvertiseModel("https://allo.ua/ua/warranty_and_service/", ""),
                        new SecondaryAdvertiseModel("https://allo.ua/ua/contact-us/", ""),
                        new SecondaryAdvertiseModel("https://allo.ua/ua/loyalty-program/", ""),
                        new SecondaryAdvertiseModel("https://allo.ua/ua/help/oplata-chastami/", ""),
                        new SecondaryAdvertiseModel("https://allo.ua/ua/allo-service/", "")
                ))
        );

        advertises.put("setantasports.com", model(
                "https://setantasports.com",
                "setantasports.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://setantasports.com/football", ""),
                        new SecondaryAdvertiseModel("https://setantasports.com/basketball", ""),
                        new SecondaryAdvertiseModel("https://setantasports.com/mma", ""),
                        new SecondaryAdvertiseModel("https://setantasports.com/racing", ""),
                        new SecondaryAdvertiseModel("https://setantasports.com/tennis", ""),
                        new SecondaryAdvertiseModel("https://setantasports.com/matches", "")
                ))
        );
        advertises.put("dybok.com.ua", model(
                "https://www.dybok.com.ua/ua/promotion",
                "dybok.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/about", ""),
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/contact", ""),
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/credit", ""),
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/payment_and_delivery", ""),
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/garantee", ""),
                        new SecondaryAdvertiseModel("https://www.dybok.com.ua/ua/cooperation", "")
                ))
        );
        advertises.put("atschool.com.ua", model(
                "https://www.atschool.com.ua/",
                "atschool.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/paket-uchen-1-4-klasy/", ""),
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/paket-uchen/", ""),
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/paket-ekstern/", ""),
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/paket-sluhach/", ""),
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/dlya-uchniv-zakordonom/", ""),
                        new SecondaryAdvertiseModel("https://www.atschool.com.ua/o-nas/", "")
                ))
        );
        advertises.put("liquimoly.ua", model(
                "https://liquimoly.ua/shop/ua/",
                "liquimoly.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/aktualniye-produkti", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/Motornye_masla", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/Prisadki", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/Avtokosmetika", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/Transmissionnye_masla", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/ua/Servisnye_produkty", "")
                ))
        );
        advertises.put("answear.ua", model(
                "https://answear.ua/answear-club",
                "answear.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://answear.ua/a/pro-answear-ua", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/a/pravyla-magazynu-answear-ua", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/mii-akkaunt/kontakt", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/a/100-oryginalni-tovary-na-answear-ua", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/c/vona", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/newsletter", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/c/dity", ""),
                        new SecondaryAdvertiseModel("https://answear.ua/c/vin", "")
                ))
        );

        advertises.put("gaz-time.ua", model(
                "https://gaz-time.ua/uk",
                "gaz-time.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/vstanovlennya-hbo", ""),
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/kalkulyator-okupnosti-hbo", ""),
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/tsina-hbo-4-pokolinnya1", ""),
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/hbo-v-rozstrochku", ""),
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/reyestratsiya-ta-sertyfikatsiya-hbo", ""),
                        new SecondaryAdvertiseModel("https://gaz-time.ua/uk/remont-hbo", "")
                ))
        );

        advertises.put("potolkoff.kiev.ua", model(
                "https://potolkoff.kiev.ua/shop/",
                "potolkoff.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/frantsuzskie-natyazhnyie-potolki/", ""),
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/glyantsevye-natyazhnye-potolki/", ""),
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/matovyie-natyazhnyie-potolki/", ""),
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/natyazhnyie-potolki-clipso/", ""),
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/zvezdnoye-nebo/", ""),
                        new SecondaryAdvertiseModel("https://potolkoff.kiev.ua/natjazhnye-potolki/mnogourovnevyie-natyazhnyie-potolki/", "")
                ))
        );

        advertises.put("apteka911.ua", model(
                "https://apteka911.ua/shop/actions",
                "apteka911.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/ot_kashlya", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/lechenie_nasmorka", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/ot_boli_v_gorle", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/zharoponizhayuschie", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/protivovirusnyie", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi/sogrevayuschie_mazi", "")
                ))
        );

        advertises.put("bigquest.com.ua", model(
                "https://bigquest.com.ua/",
                "bigquest.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/quest/big-kids-quest/", ""),
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/quest/tajnaya-stantsiya-metro/", ""),
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/blog-4/", ""),
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/pravila-2/", ""),
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/gallery/", ""),
                        new SecondaryAdvertiseModel("https://bigquest.com.ua/kontakty-2/", "")
                ))
        );

        advertises.put("eyes.ua", model(
                "https://eyes.ua/posluhy/лазерна-корекція-зору/",
                "eyes.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://eyes.ua/tsiny/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/aktsiyi/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/posluhy/дитяче-відділення/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/posluhy/перевірка-зору/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/zakhvoryuvannya-ochey/симптоми-захворювання-очей/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/posluhy/лікування-катаракти/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/zakhvoryuvannya-ochey/глаукома/", "")
                ))
        );

        advertises.put("brocard.ua", model(
                "https://www.brocard.ua/ua/promotion/",
                "brocard.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/parfumeriya", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/podarki-b", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/makiyazh-4048", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/aksesuari", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/podarunkovi-karti", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/doglyad-za-oblichchyam-ta-ochami", "")
                ))
        );

        advertises.put("ryaba.ua", model(
                "https://ryaba.ua/apetytna/",
                "ryaba.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://ryaba.ua/ryabchick/", ""),
                        new SecondaryAdvertiseModel("https://ryaba.ua/superfileo/", ""),
                        new SecondaryAdvertiseModel("https://ryaba.ua/actions/", ""),
                        new SecondaryAdvertiseModel("https://ryaba.ua/about-ryaba/", ""),
                        new SecondaryAdvertiseModel("https://ryaba.ua/about-ryaba/expert-care/", ""),
                        new SecondaryAdvertiseModel("https://ryaba.ua/staty-partnerom/", "")
                ))
        );

        advertises.put("www.lorcoffee.com.ua", model(
                "https://www.lorcoffee.com.ua/",
                "www.lorcoffee.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/assortment/capsules/", ""),
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/assortment/roast-and-ground/", ""),
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/assortment/beans/", ""),
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/our-story/", ""),
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/our-story/coffee-tasting/", ""),
                        new SecondaryAdvertiseModel("https://www.lorcoffee.com.ua/our-story/compatibility/", "")
                ))
        );

        advertises.put("elemis.com.ua", model(
                "https://elemis.com.ua/specials/",
                "elemis.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://elemis.com.ua/products/", ""),
                        new SecondaryAdvertiseModel("https://elemis.com.ua/bestsellery/", ""),
                        new SecondaryAdvertiseModel("https://elemis.com.ua/novinki/", ""),
                        new SecondaryAdvertiseModel("https://elemis.com.ua/uhod_za_licom/", ""),
                        new SecondaryAdvertiseModel("https://elemis.com.ua/uhod_za_telom/", ""),
                        new SecondaryAdvertiseModel("https://elemis.com.ua/nabory/", "")
                ))
        );

        advertises.put("dila.ua", model(
                "https://dila.ua/price.html",
                "dila.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/zagalnoklinichna.html", ""),
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/patomorfologiya.html", ""),
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/imunologiya-alergologiya.html", ""),
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/mikrobiologiya.html", ""),
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/cytogentyka.html", ""),
                        new SecondaryAdvertiseModel("https://dila.ua/laboratory/molekulyarno-genetychniy-analiz.html", "")
                ))
        );

        advertises.put("www.nissan.ua", model(
                "https://www.nissan.ua/ownership/promo_service.html",
                "www.nissan.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/maintenance-and-servicing/maintenance-and-repair.html", ""),
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/accessories-and-equipement/accessories.html", ""),
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/nissan-warranty.html", ""),
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/assistance-inssurance-and-warranty/assistance.html", ""),
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/nissan-service-promise.html", ""),
                        new SecondaryAdvertiseModel("https://www.nissan.ua/ownership/nissan-connect-apps.html", "")
                ))
        );

        advertises.put("akpp.co.ua", model(
                "https://akpp.co.ua/",
                "akpp.co.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://akpp.co.ua/o-firme/", ""),
                        new SecondaryAdvertiseModel("https://akpp.co.ua/uslugi/", ""),
                        new SecondaryAdvertiseModel("https://akpp.co.ua/nashi-klienty/", ""),
                        new SecondaryAdvertiseModel("https://akpp.co.ua/ceny/", ""),
                        new SecondaryAdvertiseModel("https://akpp.co.ua/kontakty/", "")
                ))
        );

        advertises.put("holz.ua", model(
                "https://holz.ua/ua/akcii/",
                "holz.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://holz.ua/ua/dveri/mezhkomnatnye/", ""),
                        new SecondaryAdvertiseModel("https://holz.ua/ua/dveri/vhodnye/", ""),
                        new SecondaryAdvertiseModel("https://holz.ua/ua/pol/", ""),
                        new SecondaryAdvertiseModel("https://holz.ua/ua/stenovye-paneli/", ""),
                        new SecondaryAdvertiseModel("https://holz.ua/ua/aksessuary/", ""),
                        new SecondaryAdvertiseModel("https://holz.ua/ua/stores/", "")
                ))
        );

        advertises.put("mako.in.ua", model(
                "https://mako.in.ua/",
                "mako.in.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/inektsiyna-kosmetologiya", ""),
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/lazerna-kosmetologiya", ""),
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/masazh-ruchniy", ""),
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/aparatna-korektsiya-figuri", ""),
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/lazerna-yepilyatsiya-2", ""),
                        new SecondaryAdvertiseModel("https://mako.in.ua/service/list/permanentniy-makiyazh-2", "")
                ))
        );

        advertises.put("super-money-counters.com.ua", model(
                "https://super-money-counters.com.ua/",
                "super-money-counters.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/counters/", ""),
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/detectors/", ""),
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/schetchiki-monet/", ""),
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/vesy/", ""),
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/printery-chekov/", ""),
                        new SecondaryAdvertiseModel("https://super-money-counters.com.ua/printery-dlya-pechati-etiketok/", "")
                ))
        );

        advertises.put("apexauto.com.ua", model(
                "https://apexauto.com.ua/price/",
                "apexauto.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/diagnostika-avtomobilya/", ""),
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/to-avto/", ""),
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/remont-hodovoj-chasti-avtomobilya/", ""),
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/diagnostika-dvigatelya/", ""),
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/chistka-forsunok/", ""),
                        new SecondaryAdvertiseModel("https://apexauto.com.ua/kompyuternaya-diagnostika-avto/", "")
                ))
        );

        advertises.put("mitsubishi-kyiv.niko.ua", model(
                "https://mitsubishi-kyiv.niko.ua/news/zaproshuemo-na-obslugovuvannya-v-niko-avtoalyans",
                "mitsubishi-kyiv.niko.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/offers", ""),
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/news", ""),
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/corporate-sales", ""),
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/test-drive", ""),
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/working-hours-dealers", ""),
                        new SecondaryAdvertiseModel("https://mitsubishi-kyiv.niko.ua/maintenance-calculator", "")
                ))
        );

        advertises.put("solofordiamonds.com.ua", model(
                "https://solofordiamonds.com.ua/rings",
                "solofordiamonds.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/necklaces", ""),
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/wedding_rings", ""),
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/engagement", ""),
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/solo_by", ""),
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/bracelets", ""),
                        new SecondaryAdvertiseModel("https://solofordiamonds.com.ua/earrings", "")
                ))
        );

        advertises.put("www.purina.ua", model(
                "https://www.purina.ua/",
                "www.purina.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.purina.ua/find-a-pet/articles", ""),
                        new SecondaryAdvertiseModel("https://www.purina.ua/dog/dog-food", ""),
                        new SecondaryAdvertiseModel("https://www.purina.ua/cat/cat-food", ""),
                        new SecondaryAdvertiseModel("https://www.purina.ua/pet-care", ""),
                        new SecondaryAdvertiseModel("https://www.purina.ua/meet-purina", ""),
                        new SecondaryAdvertiseModel("https://www.purina.ua/our-impact", "")
                ))
        );

        advertises.put("liko-school.kyiv.ua", model(
                "https://liko-school.kyiv.ua/uk/",
                "liko-school.kyiv.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/dlia-batkiv", ""),
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/komanda", ""),
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/history", ""),
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/infrastruktura", ""),
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/shkilni-polityky", ""),
                        new SecondaryAdvertiseModel("https://liko-school.kyiv.ua/uk/headers/zmi-pro-nas", "")
                ))
        );

        advertises.put("tet-textile.com.ua", model(
                "https://tet-textile.com.ua/ua/",
                "tet-textile.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g25109806-pledy-pokryvala-mikrofibry", ""),
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g25898826-myagkie-igrushki-pledom", ""),
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g121037959-plyushevoe-postelnoe-bele", ""),
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g117842145-halaty", ""),
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g95204013-pledy-rukavami", ""),
                        new SecondaryAdvertiseModel("https://tet-textile.com.ua/ua/g101430078-pledy-svetyaschiesya-temnote", "")
                ))
        );

        advertises.put("crystalit.com.ua", model(
                "https://crystalit.com.ua/uk/",
                "crystalit.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/podokonniki-f1338084/", ""),
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/aksessuary-dlya-okon-f106977/", ""),
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/remont-okon-f106980/", ""),
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/lesomaterialy-f182172339/", ""),
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/osteklenie-i-remont-balkonov-f194394/", ""),
                        new SecondaryAdvertiseModel("https://crystalit.com.ua/uk/products/otkosy-na-okna-i-dveri-f106978/", "")
                ))
        );

        advertises.put("jcs.ua", model(
                "https://jcs.ua/ua/",
                "jcs.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/gitary-i-bas-gitary/", ""),
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/klavishnye-instrumenty/", ""),
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/barabany-i-perkussiya/", ""),
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/studiinoe-oborudovanie/", ""),
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/zvukovoe-oborudovanie/", ""),
                        new SecondaryAdvertiseModel("https://jcs.ua/ua/mikrofony-i-radiosistemy/", "")
                ))
        );

//        https://www.bmw.ua/uk/topics/offers-and-services/special_offers.html
//        https://www.lumident.kiev.ua/ua/services/skoraja-stomatologicheskaja-pomosch?gclid=Cj0KCQiArrCvBhCNARIsAOkAGcX3xRKdhVHBraRwbfTCD5h-r0qfpHVvoNgiXVaXRAUdrqaXqUBPYYMaApn3EALw_wcB
//        https://viyar.ua/ua/news/do_30_na_gotovi_dveri_starke_dlya_shafi_kupe/?gclid=Cj0KCQiArrCvBhCNARIsAOkAGcU2PXFAATBbBlQqF8nWVXmRpeuZhzcH0smaxRrHjP7z_mnCZJxHzvQaAvAaEALw_wcB


//        advertises.put("superhotel.kiev.ua", model(
//                "http://superhotel.kiev.ua",
//                "superhotel.kiev.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/about/", ""),
//                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/action/", ""),
//                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minihotel/", ""),
//                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minigostinica/", ""),
//                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/gostpochasovo/", "")
//                ))
//        );

////        advertises.put("mgorodok.com.ua", model(
////                "https://mgorodok.com.ua/promo",
////                "mgorodok.com.ua",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/documents", ""),
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/services", ""),
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/contacts", ""),
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/how2buy", ""),
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/credit", ""),
////                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/map", "")
////                ))
////        );

//        advertises.put("volia.com", model(
//                "https://volia.com/ukr/tv-online/",
//                "volia.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/news/", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/tv-online//", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/equipment/", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/news/article/komplayens/", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/b2b/", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/internet/", ""),
//                        new SecondaryAdvertiseModel("https://volia.com/ukr/tv/", "")
//                ))
//        );
//        advertises.put("urist24.kiev.ua", model(
//                "https://urist24.kiev.ua/banks",
//                "urist24.kiev.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/migra", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/kriminal", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/famyli", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/spadok", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/zeml", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/neruhomist", ""),
//                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/trud", "")
//                ))
//        );
//        advertises.put("1swim.com.ua", model(
//                "https://1swim.com.ua/zanyatiya/grudnichkovoe-plavanie/",
//                "1swim.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/contact/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/raspisanie/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/abonementy/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/about_us/nasha-komanda/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/about_us/galereya/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/zanyatiya/gruppovye-zanyatiya-plavaniem-dlya-detej/", ""),
//                        new SecondaryAdvertiseModel("https://1swim.com.ua/zanyatiya/detskij-akva-fitnes/", "")
//                ))
//        );

//        advertises.put("svitlopark.ua", model(
//                "https://svitlopark.ua/news/neymovirni-dizaynerski-lobbi-u-zhk-svitlo-park-/",
//                "svitlopark.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/infrastructure/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/conditions/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/docs/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/news/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/contacts/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/benefits/", ""),
//                        new SecondaryAdvertiseModel("https://svitlopark.ua/svitlo_repair/", "")
//                ))
//        );
//        advertises.put("eldorado.ua", model(
//                "https://eldorado.ua/uk/promotions/",
//                "eldorado.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/services/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/loyalty/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/service_centers/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/gift_card/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/about/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/development/", ""),
//                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/email/", "")
//                ))
//        );
//        advertises.put("eyes.ua", model(
//                "https://eyes.ua/uslugi/lazernaya-korrekciya-zreniya/",
//                "eyes.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://eyes.ua/ceny/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/akcii/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/vse-o-katarakte/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/o-klinike/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/blog/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/uslugi/detskoye-otdeleniye/", ""),
//                        new SecondaryAdvertiseModel("https://eyes.ua/uslugi/proverka-zreniya/", "")
//                ))
//        );
////        advertises.put("luxberry.life", model(
////                "https://luxberry.life/ua/budinki-zrostajut-znizhki-trivajut-v-zhk-luxberry-lakes-forest-vid-budcapital-ta-forum-capital/",
////                "luxberry.life",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/tehnologiya-stroitelstva/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/o-zhk/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/o-zastrojshhike/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/non-residential/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/parking/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/usloviya-pokupki/", ""),
////                        new SecondaryAdvertiseModel("https://luxberry.life/ua/infrastruktura/", "")
////                ))
////        );
//        advertises.put("gemini.ua", model(
//                "https://gemini.ua/",
//                "gemini.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://gemini.ua/gemini_service/franshiza-kav-yarni/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/poslugy/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/gemini_service/trejd-in/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/blog/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/kontakty/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/product-category/rancilio/", ""),
//                        new SecondaryAdvertiseModel("https://gemini.ua/product-category/eureka/", "")
//                ))
//        );
////        advertises.put("paradise-avenue.com.ua", model(
////                "https://paradise-avenue.com.ua",
////                "paradise-avenue.com.ua",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/about/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/advantage/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/infrastructure/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/gallery/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/terms-of-purchase/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/builder/", ""),
////                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/news/", "")
////                ))
////        );
//        advertises.put("bodyart.fitness", model(
//                "https://bodyart.fitness/",
//                "bodyart.fitness",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/rozklad/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/tsiny/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/fitnes-klub-dlya-biznesu/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/gift-cards/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/personalni-trenuvannya/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/classes/", ""),
//                        new SecondaryAdvertiseModel("https://bodyart.fitness/fitnes-diyeta/", "")
//                ))
//        );
//        advertises.put("bi.ua", model(
//                "https://bi.ua/rus/action/",
//                "bi.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-malishey/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/kukly-i-pupsy/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/myagkie-igrushki/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/konstruktori/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/mashinki-modeli-tehnika/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-aktivnogo-otdiha/", ""),
//                        new SecondaryAdvertiseModel("https://bi.ua/rus/nastolnye-igry-i-pazly/", "")
//                ))
//        );
//        advertises.put("oborot.team", model(
//                "https://oborot.team/",
//                "oborot.team",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://oborot.team/ppc", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/target", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/tiktok", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/income", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/cases", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/case/manset", ""),
//                        new SecondaryAdvertiseModel("https://oborot.team/case/e-in", "")
//                ))
//        );
//        advertises.put("synergy-bud.com.ua", model(
//                "https://synergy-bud.com.ua/akczii/",
//                "synergy-bud.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/news/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/o-kompanii/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/kak-kupit/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/standart/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/commerce/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/contacts/", ""),
//                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/projects-kyiv/", "")
//                ))
//        );
//        advertises.put("krankomplekt.com", model(
//                "https://krankomplekt.com/gruzozahvat/greyfer/",
//                "krankomplekt.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/mechanic/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/grcran/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/gruzozahvat/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/compcran/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/nestandartnoe/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/radio/", ""),
//                        new SecondaryAdvertiseModel("https://krankomplekt.com/uslugi/", "")
//                ))
//        );
//        advertises.put("evrodim.com", model(
//                "https://evrodim.com/akcii/",
//                "evrodim.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://evrodim.com/europe", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/zelenyiy-bulvar", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/kottedjnie-gorodki/", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/technologii/", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/news/", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/trade-in/", ""),
//                        new SecondaryAdvertiseModel("https://evrodim.com/contacts", "")
//                ))
//        );
////        advertises.put("pine-grove.com.ua", model(
////                "https://pine-grove.com.ua/generalnij-plan",
////                "pine-grove.com.ua",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/o-gorodke", ""),
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/uchastki", ""),
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/karta-proezda", ""),
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/gallery", ""),
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/o-zastrojshike", ""),
////                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/pravila", "")
////                ))
////        );
////        advertises.put("icefood.com.ua", model(
////                "https://icefood.com.ua/discount",
////                "icefood.com.ua",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/all", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/soups", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/second-courses", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/breakfast", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/desserts", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/smoothies", ""),
////                        new SecondaryAdvertiseModel("https://icefood.com.ua/vegan", "")
////                ))
////        );
//        advertises.put("bosch-home.com.ua", model(
//                "https://www.bosch-home.com.ua/uk/specials/akcii",
//                "bosch-home.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/servis/pidtrymka", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/vidkryite-bosch", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/hotuvannya-ta-vypikannya", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/prannya-ta-sushinnya/sushylni-mashyny", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/posudomyini-mashyny", ""),
//                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/prasky", "")
//                ))
//        );
//        advertises.put("parklane.ua", model(
//                "https://parklane.ua/uk/realty-forsale",
//                "parklane.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/apartment/sale", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/house/sale", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/nonlive/sale", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/land/sale", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realtystat", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realtors/bestof", ""),
//                        new SecondaryAdvertiseModel("https://parklane.ua/uk/expert", "")
//                ))
//        );
//        advertises.put("imperatyv.ua", model(
//                "https://imperatyv.ua/ru/production",
//                "imperatyv.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/holding", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/shop", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/knowledge-base", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/dealers", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/standards", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/contact", ""),
//                        new SecondaryAdvertiseModel("https://imperatyv.ua/ru/buy", "")
//                ))
//        );
//        advertises.put("atlant.build", model(
//                "https://atlant.build/offer",
//                "atlant.build",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://atlant.build/kommertsiya", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/novosti", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/kontakty", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/opisanie", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/istoriya", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/nagradyi", ""),
//                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/otzyvy", "")
//                ))
//        );
//        advertises.put("advokatessa.com.ua", model(
//                "https://advokatessa.com.ua",
//                "advokatessa.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/o-nas/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/uslugi/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/sertifikaty/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/blog/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/stoimost/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/kontakty/", ""),
//                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/riski-pokupki-kvartiry-pri-pereustupk/", "")
//                ))
//        );
//        advertises.put("grusha.ua", model(
//                "https://grusha.ua",
//                "grusha.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/zernovoy_kofe/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/molotyy_kofe/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/monosorta/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/rastvorimyy_kofe/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/chay/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/aksessuary/", ""),
//                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/biozdorove/", "")
//                ))
//        );
//        advertises.put("suzuki.niko.ua", model(
//                "https://suzuki.niko.ua",
//                "suzuki.niko.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/news/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/accessories/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/credit/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/waranty/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/grey/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/trade-in/", ""),
//                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/owners/of-service-centers/", "")
//                ))
//        );
//        advertises.put("ok-land.riel.ua", model(
//                "https://ok-land.riel.ua",
//                "ok-land.riel.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/about", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/flats", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/komertsijna-neruhomist", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/parking", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/buyers", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/visualization", ""),
//                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/news", "")
//                ))
//        );
//        advertises.put("matrix7km.com", model(
//                "https://matrix7km.com/specials/",
//                "matrix7km.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://matrix7km.com/bytovaya-tekhnika/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/dacha-sad-ogorod/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/instrumenty-i-avtotovary/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/kompyutery-i-noutbuki/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/krasota-i-zdorove/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/krasota-i-zdorove/odezhda-obuv-aksessuary/", ""),
//                        new SecondaryAdvertiseModel("https://matrix7km.com/ofis-shkola-knigi/", "")
//                ))
//        );
//        advertises.put("trofey.ua", model(
//                "https://trofey.ua",
//                "trofey.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://trofey.ua/udilishha", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/katushki", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/leski-shnury", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/primanki", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/poplavki-signalizatory", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/krjuchki", ""),
//                        new SecondaryAdvertiseModel("https://trofey.ua/osnastki", "")
//                ))
//        );
////        advertises.put("pmstore.com", model(
////                "https://pmstore.com",
////                "pmstore.com",
////                "UA",
////                List.of(
////                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/novinki", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/store/odezhda", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/store/aksessuary", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/store/razvlecheniya", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/store/podarki", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/mahatch", ""),
////                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/sale", "")
////                ))
////        );
//        advertises.put("prime-technic.kiev.ua", model(
//                "https://prime-technic.kiev.ua",
//                "prime-technic.kiev.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/alarm.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/shumoizol.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/okleyka-avto-plonkoy.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/parctronic.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/mediaandac.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/light.html", ""),
//                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/polirovka-avtomobilya.html", "")
//                ))
//        );
//        advertises.put("tmegroup.com.ua", model(
//                "https://tmegroup.com.ua",
//                "tmegroup.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85785597-pivovarni-pod-klyuch", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85464865-varochnye-poryadki", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85463472-tskt", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85462882-forfasy", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85465085-sip-keg-mojki", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85465083-drugoe-pivovarennoe-oborudovanie", ""),
//                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g100259864-baki-nagreva-vody", "")
//                ))
//        );
//        advertises.put("stihl.ua", model(
//                "https://www.stihl.ua/aktuelles.aspx",
//                "stihl.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/produkte.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/haendlersuche.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/service.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/praxiswissen.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/unternehmen.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/unterhaltung.aspx", ""),
//                        new SecondaryAdvertiseModel("https://www.stihl.ua/discover-stihl.aspx", "")
//                ))
//        );
//        advertises.put("narvis.ua", model(
//                "https://narvis.ua",
//                "narvis.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://narvis.ua/o-nas-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/vakansii-voditelja-mezhdunarodnika-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/trudoustrojstvo-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/oformlenie-dokumentov-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/stazhirovka-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/poleznaya-informatsiya-2/", ""),
//                        new SecondaryAdvertiseModel("https://narvis.ua/kontakty-2/", "")
//                ))
//        );
//        advertises.put("tsatsa.com.ua", model(
//                "https://tsatsa.com.ua/g13198551-rasprodazha",
//                "tsatsa.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g12797849-yuvelirnaya-bizhuteriya-xuping", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g12838928-yuvelirnaya-bizhuteriya-firmy", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g96605349-bizhuteriya-stainless-steel", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g101020677-tsepi-braslety-firmy", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g101339086-stal", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g94046670-busy-naturalnogo-zhemchuga", ""),
//                        new SecondaryAdvertiseModel("https://tsatsa.com.ua/g23104333-bizhuteriya-firmy-neoglory", "")
//                ))
//        );
//        advertises.put("mtservice.kiev.ua", model(
//                "https://mtservice.kiev.ua/prochistka-kanalizacii/otkachka-vygrebnyh-yam/",
//                "mtservice.kiev.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/vodoprovod/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/otoplenie/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/kanalizaciya/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/obsluzhivanie-inzhenernyh-setej/montazh-naruzhnyh-setej/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/santehnika/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/montazh-teplogo-vodyanogo-pola/", ""),
//                        new SecondaryAdvertiseModel("https://mtservice.kiev.ua/otoplenie/montazh-kotelnyh-i-oborudovaniya/", "")
//                ))
//        );
//        advertises.put("finstaff.com.ua", model(
//                "http://finstaff.com.ua/vacancy/hot/",
//                "finstaff.com.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/job/bank/corporate", ""),
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/job/bank/international", ""),
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/job/bank/investments", ""),
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/vacancy/bank", ""),
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/vacancy/foreing", ""),
//                        new SecondaryAdvertiseModel("http://finstaff.com.ua/vacancy/young", "")
//                ))
//        );
//
//        advertises.put("alconost.com", model(
//                "https://alconost.com/ru/video-production/games/",
//                "alconost.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/about", ""),
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/localization", ""),
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/video-production", ""),
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/marketing", ""),
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/vacancy", ""),
//                        new SecondaryAdvertiseModel("https://alconost.com/ru/marketing/ppc-management", "")
//                ))
//        );
//        advertises.put("under.net.ua", model(
//                "https://under.net.ua/ru/",
//                "under.net.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/article/private/tarifs.html", ""),
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/article/private/televidenie.html", ""),
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/article/private/abon/payments.html", ""),
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/article/private/abon/Otsrochka-platezha.html", ""),
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/article/private/support.html", ""),
//                        new SecondaryAdvertiseModel("https://under.net.ua/ru/page/contacts", "")
//                ))
//        );
//        advertises.put("mrgrill.ua", model(
//                "https://mrgrill.ua/start-business",
//                "mrgrill.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/soputstvuyuschie-tovary/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/obladnannya/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/startoviy-nabir/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/sosiski-dlya-hot-dogiv/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/kovbaski-dlya-hot-dogiv/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/bulki-dlya-hot-dogiv/", ""),
//                        new SecondaryAdvertiseModel("https://mrgrill.ua/produkti/sousi/", "")
//                ))
//        );
//        advertises.put("avtokrisla.com", model(
//                "https://avtokrisla.com/uk/stocks",
//                "avtokrisla.com",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/c11-detskie-avtokresla.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/c7-kolyaski.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/c10-aksessuary.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/c57-detskaya-mebel.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/cgigiena.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/c58-detskiy-transport.html", ""),
//                        new SecondaryAdvertiseModel("https://avtokrisla.com/uk/cdlya-puteshestviy.html", "")
//                ))
//        );


//        https://spetsagroshina.kiev.ua/ua/g6641898-shiny-selskohozyajstvennye?utm_source=google&utm_medium=cpc&utm_term=&utm_content=d&google_ad=571917228441&utm_campaign=Shiny%20Selskohozyajstvennye%20KMC&gclid=CjwKCAjw4JWZBhApEiwAtJUN0NFHG4mRq7sqeYTRLZRKExh23MQhP85CVy_J2gshmz22QqgcCboCJRoCeUYQAvD_BwE
//        https://faw.ais.ua/faw-x40.html?gclid=CjwKCAjwpqCZBhAbEiwAa7pXeWT1TAvld_oNUXvKgTxTalX-TM2qVFAntZEhpubcnKWARqbtPTnfJRoChQIQAvD_BwE
//        https://desna-auto.com/ua?gclid=CjwKCAjwpqCZBhAbEiwAa7pXecxBShlDTc9kpEf0DoEVHYFhFZhc6pNmprycIb1MfXJD3OzTz95knRoCMqYQAvD_BwE
//        https://omela.ua/ua/kataloh-obladnannia?gclid=CjwKCAjwpqCZBhAbEiwAa7pXeXuH102U6isIKRBTJagsmc5C11uWi03KVlYxVsi9qZscradNDdXrIBoCA2IQAvD_BwE
//        https://ukrkompozit.com.ua/vodnye-gorki/?utm_source=google&utm_medium=cpc&utm_campaign=vodnye_gorki_smart&gclid=CjwKCAjwyaWZBhBGEiwACslQoxpowXlU25M_yVGk2idEq5MqQgq_xEc0FuHt6s3fmL2Lr-tsolrLAxoCQAIQAvD_BwE
//        https://blago.ua/evaluation-tech?utm_source=GoogleAds&gclid=CjwKCAjwyaWZBhBGEiwACslQo4gh1bTE_xvf3UwlPdnaQWlS5ShajXYon8GSaCr5QemOnRb825w_FRoCrPsQAvD_BwE
//        https://energy-assistant.com.ua/pry-pidhotovtsi-do-budivnytstva-pidpryyemstva-chy-kotedzhnoho-mistechka/?utm_source=google&utm_medium=kms&utm_campaign=1&gclid=CjwKCAjwyaWZBhBGEiwACslQoytIJfNdWpX9mVO_AoPDQgHv4jZCkSr9SupzdOHXDdssGr1mQabyPBoCBE8QAvD_BwE

//        advertises.put("kobzov.ua", model(
//                "http://kobzov.ua/shows/cirk-recordiv/",
//                "kobzov.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", "")
//                ))
//        );

//        https://majplast.pl/?gclid=CjwKCAiA_aGuBhACEiwAly57MYtrRvxXC3pwNBuIeIzmHRsAIRYvIS97xgvGPfiom5ue2lFI_Y9tqBoCWToQAvD_BwE


        return advertises;
    }


    private static AdvertiseModel model(String mainUrl, String id, String location, List<SecondaryAdvertiseModel> list) {
        return new AdvertiseModel(mainUrl, id, location, "www." + id, list);
    }
}
