public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "х" + i + "=" + i * j+"\t");
            }
            System.out.println();
        }

        // Вывести на экран все возможные сочетания слов из 4х букв в алфавитном порядке
        // Пример вывода
        // 1 КККК
        // 2 КККЛ
        // 3 КККМ
        // 4 КККН
        // 5 КККП
        // 6 ....
        // Узнать на какой позиции находится слово КННП
        /*String str = "КЛМНП";
        int index = 0;
        int position = 0;
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < str.length(); j++)
                for (int k = 0; k < str.length(); k++)
                    for (int l = 0; l < str.length(); l++) {
                        String word = ""+str.charAt(i)+str.charAt(j)+str.charAt(k)+str.charAt(l);
                        ++index;
                        if(word.equals("КННП")) position = index;
                        System.out.println(index+" "+word);
                    }
        System.out.println("Слово КННП находится на "+position+" строке");*/
        /*int[] nums = {-2,-123,-25,-234,-23,-12};
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i] && nums[i] % 2 != 0) {
                max = nums[i];
            }
        }
        System.out.println(max);*/

        /*int[] nums = {4,4,5,5,5,3,4,4,5};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println((double) sum/nums.length);*/

        /*String[] cars = {"bmw", "audi", "kia"};
        for(int i=0; i<3; i++){
            System.out.println(cars[i]);
        }*/

        /*int i=3;
        do{
            i = i + 1;
            System.out.println(i);
        }while (i<3);*/

        /*while (i<3){
            i = i + 1;
            System.out.println(i);
        }*/

        /*
        int i = 5;
        System.out.println(i++); //5
        System.out.println(++i); //7
        System.out.println(i); // 7
        System.out.println(--i); //6
        System.out.println(i--); //6
        System.out.println(i); // 5
        String[] cars = {"bmw", "audi", "kia"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);*/
    }
}
