package com.profisprint.storage;

import com.profisprint.model.advertise.AdvertiseModel;
import com.profisprint.model.advertise.SecondaryAdvertiseModel;

import java.util.HashMap;
import java.util.List;

public class AdvertiseDataInfo {

    public static HashMap<String, AdvertiseModel> advertiseData() {
        HashMap<String, AdvertiseModel> advertises = new HashMap<>();
        advertises.put("novbud.com.ua", model(
                "https://novbud.com.ua/",
                "novbud.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://novbud.com.ua/контакты/", ""),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/новости-2/", ""),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/как-купить/", ""),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/о-застройщике/", ""),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/квартиры/", "")
                ))
        );
        advertises.put("superhotel.kiev.ua", model(
                "http://superhotel.kiev.ua",
                "superhotel.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/about/", ""),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/action/", ""),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minihotel/", ""),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minigostinica/", ""),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/gostpochasovo/", "")
                ))
        );
        advertises.put("liquimoly.ua", model(
                "https://liquimoly.ua/shop/",
                "liquimoly.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Motornye_masla", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Prisadki", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Avtokosmetika", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Transmissionnye_masla", ""),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Servisnye_produkty", "")
                ))
        );
        advertises.put("blest.ua", model(
                "https://blest.ua",
                "blest.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-pryamye/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-uglovye/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-modulnye/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/category/krovati/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/category/kresla-i-pufy/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/category/matrasy/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/contacts/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/stores/", ""),
                        new SecondaryAdvertiseModel("https://blest.ua/about/", "")
                ))
        );
        advertises.put("mgorodok.com.ua", model(
                "https://mgorodok.com.ua/promo",
                "mgorodok.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/documents", ""),
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/services", ""),
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/contacts", ""),
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/how2buy", ""),
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/credit", ""),
                        new SecondaryAdvertiseModel("https://mgorodok.com.ua/map", "")
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
                        new SecondaryAdvertiseModel("https://answear.ua/c/vin", "")
                ))
        );
        advertises.put("volia.com", model(
                "https://volia.com/ukr/tv-online/",
                "volia.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://volia.com/ukr/news/", ""),
                        new SecondaryAdvertiseModel("https://ex.volia.com/ukr/about/procurement/", ""),
                        new SecondaryAdvertiseModel("https://my.volia.com/kiev/uk/faq", ""),
                        new SecondaryAdvertiseModel("https://volia.com/ukr/news/article/komplayens/", ""),
                        new SecondaryAdvertiseModel("https://volia.com/ukr/b2b/", ""),
                        new SecondaryAdvertiseModel("https://volia.com/ukr/internet/", ""),
                        new SecondaryAdvertiseModel("https://volia.com/ukr/tv/", "")
                ))
        );
        advertises.put("urist24.kiev.ua", model(
                "https://urist24.kiev.ua/banks",
                "urist24.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/migra", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/kriminal", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/famyli", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/spadok", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/zeml", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/neruhomist", ""),
                        new SecondaryAdvertiseModel("https://urist24.kiev.ua/trud", "")
                ))
        );
        advertises.put("1swim.com.ua", model(
                "https://1swim.com.ua/zanyatiya/grudnichkovoe-plavanie/",
                "1swim.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://1swim.com.ua/contact/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/raspisanie/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/abonementy/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/about_us/nasha-komanda/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/about_us/galereya/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/zanyatiya/gruppovye-zanyatiya-plavaniem-dlya-detej/", ""),
                        new SecondaryAdvertiseModel("https://1swim.com.ua/zanyatiya/detskij-akva-fitnes/", "")
                ))
        );
        advertises.put("apteka911.ua", model(
                "https://apteka911.ua/shop/actions",
                "apteka911.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://apteka911.ua/shop/actions/news", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/shop/actions/lekarstvennyie-preparatyi", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/shop/actions/krasota-i-uhod", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/shop/actions/mama-i-malyish", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/shop/actions/lechebnaya-kosmetika", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/company/kontaktyi", ""),
                        new SecondaryAdvertiseModel("https://apteka911.ua/drugs", "")
                ))
        );
        advertises.put("svitlopark.ua", model(
                "https://svitlopark.ua/news/neymovirni-dizaynerski-lobbi-u-zhk-svitlo-park-/",
                "svitlopark.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/infrastructure/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/conditions/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/docs/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/news/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/contacts/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/about/benefits/", ""),
                        new SecondaryAdvertiseModel("https://svitlopark.ua/svitlo_repair/", "")
                ))
        );
        advertises.put("eldorado.ua", model(
                "https://eldorado.ua/uk/promotions/",
                "eldorado.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/services/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/loyalty/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/service_centers/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/gift_card/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/about/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/info/development/", ""),
                        new SecondaryAdvertiseModel("https://eldorado.ua/uk/email/", "")
                ))
        );
        advertises.put("eyes.ua", model(
                "https://eyes.ua/uslugi/lazernaya-korrekciya-zreniya/",
                "eyes.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://eyes.ua/ceny/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/akcii/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/vse-o-katarakte/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/o-klinike/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/blog/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/uslugi/detskoye-otdeleniye/", ""),
                        new SecondaryAdvertiseModel("https://eyes.ua/uslugi/proverka-zreniya/", "")
                ))
        );
        advertises.put("luxberry.life", model(
                "https://luxberry.life/ua/budinki-zrostajut-znizhki-trivajut-v-zhk-luxberry-lakes-forest-vid-budcapital-ta-forum-capital/",
                "luxberry.life",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/tehnologiya-stroitelstva/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/o-zhk/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/o-zastrojshhike/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/non-residential/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/parking/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/usloviya-pokupki/", ""),
                        new SecondaryAdvertiseModel("https://luxberry.life/ua/infrastruktura/", "")
                ))
        );
        advertises.put("gemini.ua", model(
                "https://gemini.ua/",
                "gemini.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://gemini.ua/gemini_service/franshiza-kav-yarni/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/poslugy/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/gemini_service/trejd-in/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/blog/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/kontakty/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/product-category/rancilio/", ""),
                        new SecondaryAdvertiseModel("https://gemini.ua/product-category/eureka/", "")
                ))
        );
        advertises.put("brocard.ua", model(
                "https://www.brocard.ua/ua/promotion/",
                "brocard.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/brands-list", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/parfumeriya", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/doglyad-za-tilom", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/aksesuari", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/podarunkovi-karti", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/doglyad-za-oblichchyam-ta-ochami", ""),
                        new SecondaryAdvertiseModel("https://www.brocard.ua/ua/category/dlya-cholovikiv", "")
                ))
        );
        advertises.put("paradise-avenue.com.ua", model(
                "https://paradise-avenue.com.ua",
                "paradise-avenue.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/about/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/advantage/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/infrastructure/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/gallery/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/terms-of-purchase/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/builder/", ""),
                        new SecondaryAdvertiseModel("https://paradise-avenue.com.ua/news/", "")
                ))
        );
        advertises.put("bodyart.fitness", model(
                "https://bodyart.fitness/ru/",
                "bodyart.fitness",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/raspisanie/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/tseny/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/fitnes-klub-dlya-biznesa/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/gift-cards/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/personalnye-trenirovki/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/classes/", ""),
                        new SecondaryAdvertiseModel("https://bodyart.fitness/ru/fitnes-dieta/", "")
                ))
        );
        advertises.put("bi.ua", model(
                "https://bi.ua/rus/action/",
                "bi.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-malishey/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/kukly-i-pupsy/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/myagkie-igrushki/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/konstruktori/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/mashinki-modeli-tehnika/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-aktivnogo-otdiha/", ""),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/nastolnye-igry-i-pazly/", "")
                ))
        );
        advertises.put("oborot.team", model(
                "https://oborot.team/",
                "oborot.team",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://oborot.team/ppc", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/target", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/tiktok", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/income", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/cases", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/case/manset", ""),
                        new SecondaryAdvertiseModel("https://oborot.team/case/e-in", "")
                ))
        );

//        advertises.put("kobzov.ua", model(
//                "http://kobzov.ua/shows/cirk-recordiv/",
//                "kobzov.ua",
//                "UA",
//                List.of(
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", ""),
//                        new SecondaryAdvertiseModel("", "")
//                ))
//        );


        return advertises;
    }


//    https://oborot.team/?gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2FWiVHiSk4jxzkfwMFvAbXpl4r1jn8GhdAawBEUJUB_E3PRn_kUqt4aAooMEALw_wcB
//    https://synergy-bud.com.ua/projects/sinergiya-siti/room/2/?utm_source=google&utm_medium=cpc&utm_campaign=gdn-custom-intent-audiences-sinergiya-siti&utm_content&utm_term=www.youtube.com&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2G2LsFPDFytx7XAUcvn3ZSgHPUd7uj7rA7d5NvxXfnyaWz5D-aEsdoaAoz5EALw_wcB
//    https://krankomplekt.com/gruzozahvat/greyfer/?https:/krankomplekt.com/gruzozahvat/greyfer/&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2FqQup_OePAanOdmb6_ACuqo5uF-Td3ZxgBaxozrRGcEIKEKVm_DKEaAv23EALw_wcB
//    https://evrodim.com/akcii/
//    https://icefood.com.ua/discount
//    https://pine-grove.com.ua/generalnij-plan?gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2G6Y-gG9YTNhB9JHNgUBFZk9_3nabVqFUHy9Dc2W_BDmpgP52csxVEaAn10EALw_wcB
    private static AdvertiseModel model(String mainUrl, String id, String location, List<SecondaryAdvertiseModel> list) {
        return new AdvertiseModel(mainUrl, id, location, "www." + id, list);
    }
}
