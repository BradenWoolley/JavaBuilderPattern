package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiftBuilder giftBuilder = new GiftBuilder();

        List<Gift> gifts = new ArrayList<>();

        //For total price of each gift;
        float totalMothers=0f;
        float totalFarewell=0f;
        float totalThankYou=0f;
        float totalAll = 0;

        //For quantity of each gift bought
        int motherCount=0;
        int farewellCount=0;
        int thankYouCount=0;
        //for only displaying a single unique item
        int uniqueMother = 0;
        int uniqueFarewell =0;
        int uniqueThankYou =0;

        boolean canRun = true;

        while (canRun){
            System.out.println("Would you like to purchase a gift?");
            System.out.println("1.  Mothers day");
            System.out.println("2.  Thank you");
            System.out.println("3.  Farewell");
            System.out.println("0.  Quit");
            int selection = sc.nextInt();

            switch (selection){
                case 1:
                    Gift mothersday = giftBuilder.MothersDay();
                    gifts.add(mothersday);
                    break;
                case 2:
                    Gift thankYou = giftBuilder.ThankYou();
                    gifts.add(thankYou);
                    break;
                case 3:
                    Gift farewell = giftBuilder.Farewell();
                    gifts.add(farewell);
                    break;
                default:
                    canRun = false;
                    break;
            }

            System.out.println("Would you like to add another item? Y/N");
            String addMore = sc.next();

            if(addMore.equalsIgnoreCase("Y"))
                canRun = true;
            else
                canRun = false;
        }

        System.out.println("Prd_Name\tPrd_Qty\tIndividual_Price\tTotal");
        for(Gift gift:gifts){
            if(gift.name.equalsIgnoreCase("MOTHER'S DAY")){
                motherCount++;
                totalMothers += gift.price;

            }

            else if(gift.name.equalsIgnoreCase("THANK YOU")){
                thankYouCount++;
                totalThankYou += gift.price;
            }

            else if(gift.name.equalsIgnoreCase("FAREWELL")){
                farewellCount++;
                totalFarewell += gift.price;
            }

            totalAll+= gift.price;
        }

        for(Gift gift:gifts){
            if(gift.name.equalsIgnoreCase("MOTHER'S DAY") && uniqueMother < 1){
                System.out.println(gift.name+"\t"+motherCount+"\t"+gift.price+"\t"+totalMothers);
                uniqueMother++;
            }

            else if(gift.name.equalsIgnoreCase("THANK YOU") && uniqueThankYou < 1){
                System.out.println(gift.name+"\t"+thankYouCount+"\t"+gift.price+"\t"+totalThankYou);
                uniqueThankYou++;
            }

            else if(gift.name.equalsIgnoreCase("FAREWELL") && uniqueFarewell < 1){
                System.out.println(gift.name+"\t"+farewellCount+"\t"+gift.price+"\t"+totalFarewell);
                uniqueFarewell++;
            }
        }
        System.out.println("Total amount\t\t\t " + totalAll);


    }
}

