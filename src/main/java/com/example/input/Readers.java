package com.example.input;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
*Scanner → beginner, easy, but slow.
*BufferedReader → faster, but needs parsing.
*BufferedReader + StringTokenizer → standard for CP.
*BufferedReader + StringTokenizer + StringBuilder/PrintWriter → fastest CP template
*/
public class Readers {
    public static void main(String[] args) throws IOException {
//        scannerMethod();
//        bufferReaderMethod();
//        BufferedReaderStringTokenizerMethod();
        fastIO();

    }
    static void scannerMethod(){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // String b = sc.next();
        // int c = sc.nextInt();

    }

    static void bufferReaderMethod() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // specifically we need to say that type usually it getting everything as a string
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        double db = Double.parseDouble(br.readLine());

        System.out.println(n);
    }

    static void BufferedReaderStringTokenizerMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            System.out.println(x);
        }

    }


    static void fastIO() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            sb.append(Integer.parseInt(st.nextToken())).append("\n");
        }

        pw.print(sb);
        pw.flush();


    }
}
