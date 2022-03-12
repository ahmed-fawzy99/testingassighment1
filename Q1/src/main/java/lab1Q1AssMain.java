public class lab1Q1AssMain {

    public boolean WatermelonDivider(int weight) {
        if(weight % 2 == 0 && weight >= 1 && weight <= 100){

            if(weight == 2) return false; // Indivisable by 2 even numbers

            // The upcoming for loop just shows us all possible combinations, not necessary for the solution
            int[][] choices = new int[weight/2][2];
            int temp = 2;
            for (int i = 0; i < weight/2; i++) {
                choices[i][0] = temp;
                choices[i][1] =  weight - temp;
                temp += 2;
                if (temp == weight){break;}
            }
            return true;
        }
        else
            return false;
    }

}
