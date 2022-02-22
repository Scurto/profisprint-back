package com.profisprint.storage;

import com.profisprint.model.advertise.AdvertiseModel;
import com.profisprint.model.advertise.AdvertiseScreenModel;
import com.profisprint.model.advertise.SecondaryAdvertiseModel;

import java.util.HashMap;
import java.util.List;

public class AdvertiseScreenDataInfo {

    public static HashMap<String, AdvertiseScreenModel> advertiseData() {
        HashMap<String, AdvertiseScreenModel> advertises = new HashMap<>();
        advertises.put("bi.ua", model(
                "https://bi.ua/rus/action/",
                "bi.ua",
                "Акции в интернет магазине【Будинок іграшок】купить игрушки в Киеве, Харькове, Одессе",
                "bi.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-malishey/", "Игрушки для малышей - купить игрушки для новорожденного в Киеве, Украине |【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/kukly-i-pupsy/", "Куклы и пупсы - купить детские куклы и пупсы в Киеве, Украине |【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/myagkie-igrushki/", "Мягкие игрушки - купить мягкую игрушку в Киеве, Украине |【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/konstruktori/", "Конструкторы - купить конструктор для детей в Киеве, Украине |【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/mashinki-modeli-tehnika/", "Машинки, модели, техника - купить машинки, модели и игрушечную технику в Киеве, Украине | 【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/dlya-aktivnogo-otdiha/", "Для активного отдыха - купить в Киеве, Украине |【Будинок іграшок】"),
                        new SecondaryAdvertiseModel("https://bi.ua/rus/nastolnye-igry-i-pazly/", "Настольные игры и пазлы - купить настольные игры и пазлы в Киеве, Украине |【Будинок іграшок】")
                ))
        );
        advertises.put("oborot.team", model(
                "https://oborot.team/",
                "oborot.team",
                "Oborot - Рекламное Агентство, реклама в Facebook и Instagram, Google Ads, Tik Tok Ads",
                "oborot.team",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://oborot.team/ppc", "Контекстная Реклама"),
                        new SecondaryAdvertiseModel("https://oborot.team/target", "Таргетировання реклама"),
                        new SecondaryAdvertiseModel("https://oborot.team/tiktok", "Тикток реклама"),
                        new SecondaryAdvertiseModel("https://oborot.team/income", "ДОХОД"),
                        new SecondaryAdvertiseModel("https://oborot.team/cases", "Кейсы компании Oborot"),
                        new SecondaryAdvertiseModel("https://oborot.team/case/manset", "Кейс Manset"),
                        new SecondaryAdvertiseModel("https://oborot.team/case/e-in", "Кейс E-in")
                ))
        );
        advertises.put("novbud.com.ua", model(
                "https://novbud.com.ua/",
                "novbud.com.ua",
                "Петровский квартал -",
                "novbud.com.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://novbud.com.ua/контакты/", "Контакты - Петровский квартал"),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/новости-2/", "Новости - Петровский квартал"),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/как-купить/", "Как купить - Петровский квартал"),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/о-застройщике/", "О застройщике - Петровский квартал"),
                        new SecondaryAdvertiseModel("https://novbud.com.ua/квартиры/", "Квартиры - Петровский квартал")
                ))
        );
        advertises.put("superhotel.kiev.ua", model(
                "http://superhotel.kiev.ua",
                "superhotel.kiev.ua",
                "Гостиницы и отели Киева. Мини-отель, гостиница в Киеве. Цены, бронирование недорого | superhotel.kiev.ua",
                "superhotel.kiev.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/about/", "О нас | Мини-отель “На Лукьяновке”"),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/action/", "Акции | Мини-отель “На Лукьяновке”"),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minihotel/", "Мини-отель в Киеве. Киевский мини-отель почасово, посуточно. Цены на гостиницы | superhotel.kiev.ua"),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/minigostinica/", "Мини-гостиницы в Киеве. Лучшие отели и мини-гостиницы в Киеве | superhotel.kiev.ua"),
                        new SecondaryAdvertiseModel("http://superhotel.kiev.ua/gostpochasovo/", "Гостиницы почасово в Киеве. Отели и гостиницы в аренду почасово в Киеве | superhotel.kiev.ua")
                ))
        );
        advertises.put("liquimoly.ua", model(
                "https://liquimoly.ua/shop/",
                "liquimoly.ua",
                "LIQUI MOLY | Интернет-магазин | КУПИТЬ LIQUI MOLY",
                "liquimoly.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Motornye_masla", "Моторные масла"),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Prisadki", "Присадки"),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Avtokosmetika", "Автокосметика"),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Transmissionnye_masla", "Трансмиссионные масла"),
                        new SecondaryAdvertiseModel("https://liquimoly.ua/shop/Servisnye_produkty", "Сервисные продукты")
                ))
        );
        advertises.put("blest.ua", model(
                "https://blest.ua",
                "blest.ua",
                "М'які меблі від виробника купити в Україні за доступною ціною в інтернет магазині Blest",
                "blest.ua",
                "UA",
                List.of(
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-pryamye/", "Дивани прямі - купити в Україні по доступній ціні в Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-uglovye/", "Дивани кутові - купити в Україні по доступній ціні в Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/category/divany-modulnye/", "Дивани модульні - купити в Україні по доступній ціні в Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/category/krovati/", "Ліжка - buy in Ukraine at an affordable price | Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/category/kresla-i-pufy/", "М'які крісла купити недорого в Україні на сайті інтернет-магазину м'яких меблів Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/category/matrasy/", "Матраци - купити в Україні по доступній ціні в Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/contacts/", "Контакти"),
                        new SecondaryAdvertiseModel("https://blest.ua/stores/", "Магазини та фірмові відділи Blest"),
                        new SecondaryAdvertiseModel("https://blest.ua/about/", "О нас")
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


    private static AdvertiseScreenModel model(String mainUrl, String title, String description, String id, String location, List<SecondaryAdvertiseModel> list) {
        return new AdvertiseScreenModel(mainUrl, title, description, id, location, "www." + id, list);
    }
}
