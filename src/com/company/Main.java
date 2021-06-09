package com.company;

class BIZZFIZZ {


    public static void mean() {

        int x=50;
        for (int i = 1; i <= x; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("saKa");
            }
            else if (i % 3==0){
                System.out.println("ka");

            }else if (i%5==0){
                System.out.println("sa");
            } else {
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        mean();
    }
}