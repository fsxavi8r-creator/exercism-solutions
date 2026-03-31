class RaindropConverter {

    String convert(int number) {
        String result = new String();        
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            result = "PlingPlangPlong";
        } else if (number % 3 == 0 && number % 5 == 0){
            result = "PlingPlang";
        } else if (number % 5 == 0 && number % 7 == 0){
            result = "PlangPlong";
        } else if (number % 3 == 0 && number % 7 == 0){
            result = "PlingPlong";
        } else if (number % 3 == 0){
            result = "Pling";
        } else if (number % 5 == 0){
            result = "Plang";
        } else if (number % 7 == 0){
            result = "Plong";
        } else {
            result = ""+number+"";
        }
        return result;
    }
}
