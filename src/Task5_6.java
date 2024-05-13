public class Task5 {
    public static void main(String[] args) {
        Integer[] arrNull = new Integer[5];
        int sum = 0;
        for (Integer a : arrNull) {
            System.out.println(a);
        }

        for (int i = 0; i < arrNull.length; i++) {
           if (arrNull[i] == null){
               sum++;
           }
            System.out.println(sum + "- " + arrNull[i]);
        }


    }
}