
package strukturData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class linearSearch {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {9,10,15,20,26,31,36,39,42,45,48,50,53,57,59};
        int index=0;
        boolean ketemu=false;
        
        System.out.println("Data = [9,10,15,20,26,31,36,39,42,45,48,50,53,57,59]");
        System.out.print("Masukkan angka yang dicari : ");
        int cari = Integer.parseInt(br.readLine());
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == cari){
                index=i;
                ketemu=true;
            } 
        }
        if(ketemu==true){
            System.out.println("Element "+arr[index]+" ditemukan di index ke-"+index);
        } else {
            System.out.println("Element tidak ditemukan!");
        }
        
    }
}
