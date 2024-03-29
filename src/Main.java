import java.util.Scanner;

public class Main {
    public int getSum(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    private static String getMessage(String mesage) {
        return mesage;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        /*int age;
        String name;

        age = 3;
        name = "A";

        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println(13 % 4);
        int a = 10;
        int b = 10;

        System.out.println(++a + b++);
        System.out.println(b);

        System.out.println(5^9);

        int mark = 9;

        if (mark > 8) {
            System.out.println("Excellent");
        } else if (mark >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }*/

        /*int mark = 8;

        if (mark >= 7) {
            if (mark >= 9) {
                System.out.println("S");
            } else {
                System.out.printf("A");
            }
        } else {
            if (mark >= 5) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }*/

        /*String day = "3";

        switch (day) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6": {
                System.out.printf("Work");
                break;
            }
            case "7":
            case "CN": {
                System.out.println("Rest");
                break;
            }
        }*/

        /*int sum = 0, i = 0;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("N: " + sum);*/

        /*do {
            sum = sum + i;
            i++;
        } while (i < 10);
        System.out.println("N: " + sum);*/

        /*do {
            sum = i + 1;
            i++;
            System.out.println("N: " + sum);
        } while (i < 10);

        for (int a = 0; a < 10; a += 1) {
            System.out.println(a);
        }*/
        /*for (int i = 1; i <= 10; i++) {
            if (i == 6)
                break;
            int product = 6 * i;
            System.out.println("6 x " + i + " = " + product);
        }*/

        /*for (int i = 1; i <= 10; i++) {
            if (i == 6)
                continue;
            int product = 6 * i;
            System.out.println("6 x " + i + " = " + product);
        }*/

        //Scanner scanner = new Scanner(System.in);
        /*int number;
        int sum = 0;*/
        /*do {
            System.out.println("Menu");
            number = scanner.nextInt();
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Sort");
            System.out.println("0. Exit");
        } while (number != 0);*/

        //System.out.printf("baeldung%nline%nterminator");

        //int[] num = {1,2,3,4,5,6,7,8,9};

        /*double[] nums = new double[10];
        nums[0] = 8.9;
        nums[1] = 5.2;
        nums[2] = 14.11;
        nums[3] = 5.4;
        nums[4] = 4.2;
        nums[5] = 6.34;
        nums[6] = 6.2;
        nums[7] = 7.4;
        nums[8] = 1.24;
        nums[9] = 32.4;*/

        /*for (double number : nums) {
            System.out.println(number);
        }*/

        /*for (int i = 0 ;i<numbers.length;i++){
            System.out.println(i);
        }*/

        //System.out.println(nums.length);
        /*int num1 = 123;
        int num2 = 234;
        int sum = new Main().getSum(num1, num2);
        System.out.println(sum);*/

        //có thể sử dụng public static int getSum(int a, int b), khi đó  int sum = getSum(num1 , num2);

        /*String mes = getMessage("Wellcome to Summoner Rift");
        System.out.println();*/
       /* int a = 2;
        boolean req = true;*/

        int a = 123;
        int b = 213;
        int c = new Main().max(a, b);
        System.out.println("Giá trị lớn nhất giữa " + a + " và " + b + " là: " + c);
    }



    public int max(int a, int b) {
        int result;

        if (a > b)
            result = a;
        else
            result = b;
        return result;
    }


}



