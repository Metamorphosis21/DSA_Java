import java.util.*;

public class BasicHasing {
    public static void main(String[] args) {

        // Brute Force : Storing and fetching
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array: ");
        // int[] arr = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int hash[] = new int[5];
        // for (int i = 0; i < 5; i++) {
        //     hash[arr[i]] += 1;
        // }

        // int e;
        // System.out.println("Enter number of search elements: ");
        // e = sc.nextInt();
        // while (e-- != 0) {
        //     int number;
        //     System.out.println("Enter your search element:");
        //     number = sc.nextInt();
        //     System.out.println("Frequency: "+hash[number]);
        // }
        



        // Character hashing :
        // System.out.println("Enter your string: ");
        // String str = sc.next();
        // int charHash[] = new int[256];
        // for (int i = 0; i < str.length(); i++) {
        //     charHash[str.charAt(i)]++;
        // }

        // System.out.println("Number of characters to search: ");
        // int ch = sc.nextInt();
        // while (ch-- > 0) {
        //     System.out.println("Enter character: ");
        //     char c = sc.next().charAt(0);
        //     System.out.println("Frequency: " + charHash[c]);
        // }




        // HashMap : 
        int a[] = {10, 20, 30, 40, 50, 60};
        HashMap <Integer , Integer> hmp = new HashMap<>();
        HashMap <Integer , Integer> newhmp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hmp.put(i+1 ,a[i]);//put()
        }
        System.out.println(hmp);

        System.out.println(hmp.keySet());// keySet() , values()
        System.out.println(hmp.values());

        System.out.println(hmp.get(3));// get()
        System.out.println(hmp.get(5));

        System.out.println(hmp.containsKey(1));// containsKey() , containsValue()
        System.out.println(hmp.containsValue(20));

        System.out.println(hmp.remove(2, 20));// remove()
        System.out.println(hmp);

        hmp.putIfAbsent(2, 20);//putIfAbsent()

        hmp.replace(6, 69);//replace()
        hmp.replaceAll((k,v) -> v+10);//replaceAll()

        hmp.compute(2, (k , v) -> v+20);//compute()
        hmp.computeIfAbsent(7, k -> 100);//computeIfAbsent()


        System.out.println(hmp.size());//size()

        hmp.putAll(newhmp);

        System.out.println("hmp-"+hmp);
        System.out.println("newhmp-"+newhmp);

        hmp.clear();//clear()
        System.out.println(hmp.isEmpty());//isEmpty()
    }
}
