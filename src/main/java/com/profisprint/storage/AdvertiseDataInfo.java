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
        advertises.put("synergy-bud.com.ua", model(
                "https://synergy-bud.com.ua/akczii/",
                "synergy-bud.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/news/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/o-kompanii/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/kak-kupit/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/standart/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/commerce/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/contacts/", ""),
                        new SecondaryAdvertiseModel("https://synergy-bud.com.ua/projects-kyiv/", "")
                ))
        );
        advertises.put("krankomplekt.com", model(
                "https://krankomplekt.com/gruzozahvat/greyfer/",
                "krankomplekt.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://krankomplekt.com/mechanic/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/grcran/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/gruzozahvat/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/compcran/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/nestandartnoe/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/radio/", ""),
                        new SecondaryAdvertiseModel("https://krankomplekt.com/uslugi/", "")
                ))
        );
        advertises.put("evrodim.com", model(
                "https://evrodim.com/akcii/",
                "evrodim.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://evrodim.com/europe", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/zelenyiy-bulvar", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/kottedjnie-gorodki/", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/technologii/", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/news/", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/trade-in/", ""),
                        new SecondaryAdvertiseModel("https://evrodim.com/contacts", "")
                ))
        );
        advertises.put("pine-grove.com.ua", model(
                "https://pine-grove.com.ua/generalnij-plan",
                "pine-grove.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/o-gorodke", ""),
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/uchastki", ""),
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/karta-proezda", ""),
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/gallery", ""),
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/o-zastrojshike", ""),
                        new SecondaryAdvertiseModel("https://pine-grove.com.ua/pravila", "")
                ))
        );
        advertises.put("icefood.com.ua", model(
                "https://icefood.com.ua/discount",
                "icefood.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://icefood.com.ua/all", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/soups", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/second-courses", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/breakfast", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/desserts", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/smoothies", ""),
                        new SecondaryAdvertiseModel("https://icefood.com.ua/vegan", "")
                ))
        );
        advertises.put("bosch-home.com.ua", model(
                "https://www.bosch-home.com.ua/uk/specials/akcii",
                "bosch-home.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/servis/pidtrymka", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/vidkryite-bosch", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/hotuvannya-ta-vypikannya", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/prannya-ta-sushinnya/sushylni-mashyny", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/posudomyini-mashyny", ""),
                        new SecondaryAdvertiseModel("https://www.bosch-home.com.ua/uk/produkty/prasky", "")
                ))
        );
        advertises.put("parklane.ua", model(
                "https://parklane.ua/uk/realty-forsale",
                "parklane.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/apartment/sale", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/house/sale", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/nonlive/sale", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realty_search/land/sale", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realtystat", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/realtors/bestof", ""),
                        new SecondaryAdvertiseModel("https://parklane.ua/uk/expert", "")
                ))
        );
        advertises.put("stekloarmatura.com.ua", model(
                "https://stekloarmatura.com.ua/produktsiya",
                "stekloarmatura.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/o-nas", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/kharakteristiki", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/preimushchestva", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/stekloplastikovaya-armatura-tsena", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/galereya", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/kontakty", ""),
                        new SecondaryAdvertiseModel("https://stekloarmatura.com.ua/primenenie", "")
                ))
        );
        advertises.put("atlant.build", model(
                "https://atlant.build/offer",
                "atlant.build",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://atlant.build/kommertsiya", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/novosti", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/kontakty", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/opisanie", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/istoriya", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/nagradyi", ""),
                        new SecondaryAdvertiseModel("https://atlant.build/o-kompanii/otzyvy", "")
                ))
        );
        advertises.put("advokatessa.com.ua", model(
                "https://advokatessa.com.ua",
                "advokatessa.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/o-nas/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/uslugi/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/sertifikaty/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/blog/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/stoimost/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/kontakty/", ""),
                        new SecondaryAdvertiseModel("https://advokatessa.com.ua/riski-pokupki-kvartiry-pri-pereustupk/", "")
                ))
        );
        advertises.put("grusha.ua", model(
                "https://grusha.ua",
                "grusha.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/zernovoy_kofe/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/molotyy_kofe/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/monosorta/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/rastvorimyy_kofe/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/chay/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/aksessuary/", ""),
                        new SecondaryAdvertiseModel("https://grusha.ua/catalog/biozdorove/", "")
                ))
        );
        advertises.put("suzuki.niko.ua", model(
                "https://suzuki.niko.ua",
                "suzuki.niko.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/news/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/accessories/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/credit/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/waranty/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/grey/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/buying/trade-in/", ""),
                        new SecondaryAdvertiseModel("https://suzuki.niko.ua/owners/of-service-centers/", "")
                ))
        );
        advertises.put("ok-land.riel.ua", model(
                "https://ok-land.riel.ua",
                "ok-land.riel.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/about", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/flats", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/komertsijna-neruhomist", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/parking", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/buyers", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/visualization", ""),
                        new SecondaryAdvertiseModel("https://ok-land.riel.ua/news", "")
                ))
        );
        advertises.put("matrix7km.com", model(
                "https://matrix7km.com/specials/",
                "matrix7km.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://matrix7km.com/bytovaya-tekhnika/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/dacha-sad-ogorod/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/instrumenty-i-avtotovary/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/kompyutery-i-noutbuki/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/krasota-i-zdorove/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/krasota-i-zdorove/odezhda-obuv-aksessuary/", ""),
                        new SecondaryAdvertiseModel("https://matrix7km.com/ofis-shkola-knigi/", "")
                ))
        );
        advertises.put("trofey.ua", model(
                "https://trofey.ua",
                "trofey.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://trofey.ua/udilishha", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/katushki", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/leski-shnury", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/primanki", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/poplavki-signalizatory", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/krjuchki", ""),
                        new SecondaryAdvertiseModel("https://trofey.ua/osnastki", "")
                ))
        );
        advertises.put("pmstore.com", model(
                "https://pmstore.com",
                "pmstore.com",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/novinki", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/store/odezhda", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/store/aksessuary", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/store/razvlecheniya", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/store/podarki", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/mahatch", ""),
                        new SecondaryAdvertiseModel("https://pmstore.com/compilation/sale", "")
                ))
        );
        advertises.put("prime-technic.kiev.ua", model(
                "https://prime-technic.kiev.ua",
                "prime-technic.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/alarm.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/shumoizol.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/okleyka-avto-plonkoy.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/parctronic.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/mediaandac.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/light.html", ""),
                        new SecondaryAdvertiseModel("https://prime-technic.kiev.ua/polirovka-avtomobilya.html", "")
                ))
        );
        advertises.put("tmegroup.com.ua", model(
                "https://tmegroup.com.ua",
                "tmegroup.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85785597-pivovarni-pod-klyuch", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85464865-varochnye-poryadki", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85463472-tskt", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85462882-forfasy", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85465085-sip-keg-mojki", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g85465083-drugoe-pivovarennoe-oborudovanie", ""),
                        new SecondaryAdvertiseModel("https://tmegroup.com.ua/g100259864-baki-nagreva-vody", "")
                ))
        );
        advertises.put("stihl.ua", model(
                "https://www.stihl.ua/aktuelles.aspx",
                "stihl.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://www.stihl.ua/produkte.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/haendlersuche.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/service.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/praxiswissen.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/unternehmen.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/unterhaltung.aspx", ""),
                        new SecondaryAdvertiseModel("https://www.stihl.ua/discover-stihl.aspx", "")
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


    private static AdvertiseModel model(String mainUrl, String id, String location, List<SecondaryAdvertiseModel> list) {
        return new AdvertiseModel(mainUrl, id, location, "www." + id, list);
    }
}
