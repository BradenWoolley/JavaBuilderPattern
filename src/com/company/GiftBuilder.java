package com.company;

public class GiftBuilder {
    public Gift MothersDay(){
        Gift gift = new Gift();
        gift.name = "Mother's day";
        gift.price = 260.f;
        gift.addItem(new Bouquet());
        gift.addItem(new MothersDayCard());
        gift.addItem(new PersonalizedMug());
        return gift;
    }

    public Gift ThankYou(){
        Gift gift = new Gift();
        gift.name = "Thank You";
        gift.price = 100.f;
        gift.addItem(new ThankYouCard());
        gift.addItem(new GiftPhotoFrame());
        return gift;
    }

    public Gift Farewell(){
        Gift gift = new Gift();
        gift.name = "Farewell";
        gift.price = 186.f;
        gift.addItem(new FarewellCard());
        gift.addItem(new GiftPenSet());
        return gift;
    }
}
