package gh2;

import edu.princeton.cs.algs4.StdAudio;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ExecutorService;

public class Haruhikage {
    public static final double C = 261.63;
    public static final double D = 293.66;
    public static final double E = 329.63;
    public static final double F = 349.23;
    public static final double G = 392.00;
    public static final double A = 440.00;
    public static final double B = 493.88;

    public static final int QUARTER = 30000;
    public static final int EIGHTH = 15000;
    public static final int SIXTEENTH = 7500;

    public static final long BPM = 97;

    public static void main(String[] args) throws InterruptedException {
        play1_2();
        play3();
        play4();
        play5();
        play6();
        play7();
        play8();
        play9();
        play10();
        play11();
        play12();
        play13();
        play14();
        play15();
        play16();
        play17();
        play18();
        play19();
        play20();
        play21();
        play22();
        play23();
        play24();
        play25();
        play26();
        play27();
        play28();
        play29();
        play30();
        play31();
        play32();
        play33();
    }

    public static void play(double CONCERT_X, int duration) {
        GuitarString aString = new GuitarString(CONCERT_X);
        aString.pluck();
        for (int i = 0; i < duration; i += 1) {
            StdAudio.play(aString.sample());
            aString.tic();
        }
    }

    public static void pause(int duration) throws InterruptedException {
        long time = (long)duration * 2 / BPM;
        TimeUnit.MILLISECONDS.sleep(time);
    }

    public static void chord(double CONCERT1, double CONCERT2, int duration) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.execute(() -> {
//        });
//        executorService.execute(() -> {
//        });
            play(CONCERT1, duration);
//            play(CONCERT2, duration);
    }


    public static void play1_2() {
        // (1)
        for (int i = 0; i < 3; i += 1) {
            play(2*E, QUARTER);
            play(2*D, EIGHTH);
            play(2*C, QUARTER);
            play(2*D, EIGHTH);

            play(2*E, EIGHTH+SIXTEENTH);
            play(2*F, SIXTEENTH);
            play(2*E, EIGHTH);
            play(2*D, QUARTER+EIGHTH);
        }

        play(2*E, QUARTER);
        play(2*D, EIGHTH);
        play(2*C, QUARTER);
        play(2*D, EIGHTH);

        play(2*E, EIGHTH+SIXTEENTH);
        play(2*F, SIXTEENTH);
        play(2*E, EIGHTH);
        play(2*D, QUARTER);
        play(C, SIXTEENTH);
        play(C, SIXTEENTH);
    }

    public static void play3() throws InterruptedException {
        // (9)
        play(E, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(D, EIGHTH);
        play(D, EIGHTH);
        play(C, SIXTEENTH);
        play(C, SIXTEENTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(D, QUARTER);
        play(C, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, QUARTER+EIGHTH);

        pause(QUARTER+EIGHTH);
        play(E, EIGHTH);
        play(G, EIGHTH);
        play(2*C, EIGHTH);
    }

    public static void play4() {
        // (13)
        play(B, QUARTER);
        play(2*C, EIGHTH);
        play(B, QUARTER);
        play(2*C, EIGHTH);

        play(B, SIXTEENTH);
        play(A, SIXTEENTH);
        play(G, QUARTER);
        play(G, EIGHTH);
        play(D, EIGHTH);
        play(F, EIGHTH);

        play(F, QUARTER);
        play(E, EIGHTH);
        play(E, QUARTER);
        play(0.5*G, SIXTEENTH);

        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(E, QUARTER);
        play(G, EIGHTH);
    }

    public static void play5() throws InterruptedException {
        //(17)
        play(C, QUARTER+EIGHTH);
        pause(QUARTER+EIGHTH);
        play(C, EIGHTH);

        play(D, EIGHTH);
        play(C, EIGHTH+SIXTEENTH);
        play(0.5*B, SIXTEENTH);
        play(C, EIGHTH);
        play(G, EIGHTH);
        play(C, EIGHTH);

        play(F, QUARTER);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(C, EIGHTH);
        play(C, EIGHTH);

        play(C, QUARTER+EIGHTH);
        pause(QUARTER+EIGHTH);
        play(C, SIXTEENTH);
        play(D, SIXTEENTH);
    }

    public static void play6() throws InterruptedException {
        // (21)
        play3();
    }

    public static void play7() {
        // (25)
        play4();
    }

    public static void play8() throws InterruptedException {
        // (29)
        play(C, QUARTER+EIGHTH);
        pause(QUARTER);
        play(C, SIXTEENTH);
        play(C, SIXTEENTH);

        play(D, EIGHTH);
        play(C, QUARTER);
        play(C, EIGHTH);
        play(G, EIGHTH);
        play(C, EIGHTH);

        play(F, EIGHTH);
        play(F, SIXTEENTH);
        play(F, SIXTEENTH);
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(D, EIGHTH);
        play(C, EIGHTH);
        play(C, EIGHTH);

        play(C, 3*QUARTER);
    }

    public static void play9() {
        // (33)
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(E, EIGHTH);

        play(E, EIGHTH);
        play(D, EIGHTH);
        play(D, EIGHTH);
        play(D, QUARTER);
        play(G, EIGHTH);

        play(G, EIGHTH);
        play(F, SIXTEENTH);
        play(F, SIXTEENTH);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(D, EIGHTH);
        play(C, EIGHTH);
        play(C, SIXTEENTH);
        play(0.5*B, SIXTEENTH);
        play(C, QUARTER+EIGHTH);
    }

    public static void play10() {
        // (37)
        play(A, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);

        play(E, EIGHTH);
        play(D, EIGHTH);
        play(D, EIGHTH);
        play(D, QUARTER);
        play(E, EIGHTH);

        play(F, EIGHTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(E, EIGHTH);

        play(2*D, QUARTER);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(2*C, EIGHTH);
    }

    public static void play11() throws InterruptedException {
        // (41)
        play(B, EIGHTH);
        play(A, EIGHTH);
        play(A, EIGHTH);
        play(A, QUARTER+EIGHTH);

        pause(QUARTER);
        play(A, EIGHTH);
        play(A, EIGHTH);
        play(G, EIGHTH);
        play(F, SIXTEENTH);
        play(F, SIXTEENTH);

        play(F, QUARTER);
        play(E, EIGHTH);
        play(E, SIXTEENTH);
        play(F, SIXTEENTH);
        play(G, 4*QUARTER);
    }

    public static void play12() {
        // (45)
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(F, SIXTEENTH);
        play(G, QUARTER);
        play(F, SIXTEENTH);
        play(G, SIXTEENTH);

        play(A, QUARTER);
        play(A, SIXTEENTH);
        play(B, SIXTEENTH);
        play(2*C, QUARTER);
        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(G, QUARTER+EIGHTH);
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);

        play(E, QUARTER);
        play(F, SIXTEENTH);
        play(E, SIXTEENTH);
        play(G, QUARTER+EIGHTH);
    }

    public static void play13() throws InterruptedException {
        // (49)
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, EIGHTH);
        play(G, QUARTER);
        play(F, SIXTEENTH);
        play(G, SIXTEENTH);

        play(A, QUARTER);
        pause(SIXTEENTH);
        play(G, SIXTEENTH);
        play(A, SIXTEENTH);
        play(B, QUARTER);
        pause(SIXTEENTH);
        play(E, SIXTEENTH);

        play(2*E, EIGHTH);
        play(2*E, EIGHTH+SIXTEENTH);
        play(2*E, SIXTEENTH);
        play(2*F, EIGHTH);
        play(2*E, EIGHTH);
        play(2*D, EIGHTH);

        play(2*D, QUARTER);
        play(2*C, SIXTEENTH);
        play(B, SIXTEENTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);
    }

    public static void play14() {
        // (53)
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, EIGHTH);

        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*D, EIGHTH+SIXTEENTH);
        play(2*E, SIXTEENTH);
        play(2*D, EIGHTH);
        play(2*C, QUARTER);
        play(2*C, SIXTEENTH);
    }

    public static void play15() {
        // (57)
        play(B, EIGHTH);
        play(A, EIGHTH);
        play(A, EIGHTH);
        play(A, QUARTER);
        play(G, EIGHTH);

        play(G, QUARTER);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(E, 3*QUARTER);

        play(E, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
    }

    public static void play16() throws InterruptedException {
        // (61)
        play(C, 3*QUARTER);

        pause(2*QUARTER+EIGHTH);
        play(C, SIXTEENTH);
        play(D, SIXTEENTH);

        play(E, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(D, EIGHTH);
        play(D, EIGHTH);
        play(C, SIXTEENTH);
        play(C, SIXTEENTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
    }

    public static void play17() throws InterruptedException {
        // (65)
        play(D, QUARTER);
        play(C, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, QUARTER+EIGHTH);

        pause(QUARTER+EIGHTH);
        play(E, EIGHTH);
        play(G, EIGHTH);
        play(2*C, EIGHTH);

        play(B, QUARTER);
        play(2*C, EIGHTH);
        play(B, QUARTER);
        play(2*C, EIGHTH);

        play(B, SIXTEENTH);
        play(A, SIXTEENTH);
        play(G, QUARTER);
        play(G, EIGHTH);
        play(D, EIGHTH);
        play(F, EIGHTH);
    }

    public static void play18() throws InterruptedException {
        // (69)
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(E, EIGHTH);
        play(E, QUARTER+EIGHTH);

        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(E, QUARTER);
        play(G, EIGHTH);

        play(C, QUARTER+EIGHTH);
        pause(QUARTER);
        play(C, SIXTEENTH);
        play(C, SIXTEENTH);

        play(D, EIGHTH);
        play(C, QUARTER);
        play(C, EIGHTH);
        play(G, EIGHTH);
        play(C, EIGHTH);
    }

    public static void play19() {
        // (73)
        play(F, QUARTER);
        play(E, EIGHTH);
        play(D, QUARTER);
        play(C, EIGHTH);

        play(C, 3*QUARTER);

        play(A, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);

        play(E, EIGHTH);
        play(D, EIGHTH);
        play(D, EIGHTH);
        play(D, QUARTER);
        play(G, EIGHTH);
    }

    public static void play20() throws InterruptedException {
        // (77)
        play(G, EIGHTH);
        play(F, SIXTEENTH);
        play(F, SIXTEENTH);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(D, QUARTER);
        play(C, SIXTEENTH);
        play(0.5*B, SIXTEENTH);
        play(C, QUARTER+EIGHTH);

        play(A, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);

        play(E, EIGHTH);
        play(D, EIGHTH);
        play(D, EIGHTH);
        play(D, QUARTER);
        play(E, EIGHTH);
    }

    public static void play21() throws InterruptedException {
        // (81)
        play(F, EIGHTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, SIXTEENTH);
        play(E, EIGHTH);
        play(D, EIGHTH);
        play(E, EIGHTH);

        play(2*D, QUARTER);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(2*C, EIGHTH);

        play(B, QUARTER);
        play(A, EIGHTH);
        play(A, QUARTER+EIGHTH);

        pause(QUARTER);
        play(A, EIGHTH);
        play(A, EIGHTH);
        play(G, EIGHTH);
        play(F, SIXTEENTH);
        play(F, SIXTEENTH);
    }

    public static void play22() throws InterruptedException {
        // (85)
        play(F, QUARTER);
        play(E, EIGHTH);
        play(E, SIXTEENTH);
        play(F, SIXTEENTH);
        play(G, 4*QUARTER);

        play(F, EIGHTH);
        play(A, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*E, QUARTER);
        play(2*C, EIGHTH);
        play(F, EIGHTH);

        play(F, EIGHTH);
        play(A, EIGHTH);
        play(2*E, QUARTER);
        play(A, EIGHTH);
        play(F, EIGHTH);
    }

    public static void play23() {
        // (89)
        play(2*C, QUARTER);
        play(2*C, SIXTEENTH);
        play(2*D, SIXTEENTH);
        play(2*D, QUARTER);
        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*C, QUARTER);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);

        play(F, EIGHTH);
        play(A, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*E, QUARTER);
        play(2*C, EIGHTH);
        play(F, EIGHTH);

        play(F, EIGHTH);
        play(A, EIGHTH);
        play(2*E, QUARTER);
        play(A, EIGHTH);
        play(F, EIGHTH);
    }

    public static void play24(){
        // (93)
        play(2*C, QUARTER);
        play(2*C, SIXTEENTH);
        play(2*D, SIXTEENTH);
        play(2*D, QUARTER);
        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*C, QUARTER);
        play(2*C, SIXTEENTH);
        play(2*E, SIXTEENTH);
        play(2*E, QUARTER);
        play(2*E, SIXTEENTH);
        play(2*D, SIXTEENTH);

        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*E, EIGHTH);
        play(2*C, QUARTER);

        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, SIXTEENTH);
        play(A, SIXTEENTH);
    }

    public static void play25() throws InterruptedException {
        // (97)
        play(G, EIGHTH);
        play(2*E, 2*QUARTER+EIGHTH);

        pause(3*QUARTER);

        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*E, EIGHTH);
        play(2*C, QUARTER);

        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, SIXTEENTH);
        play(A, SIXTEENTH);
    }

    public static void play26() throws InterruptedException {
        // (101)
        play(G, EIGHTH);
        play(2*E, EIGHTH);
        play(2*D, EIGHTH);
        play(2*D, QUARTER+EIGHTH);

        play(2*D, SIXTEENTH);
        play(2*D, SIXTEENTH);
        play(2*D, EIGHTH);
        play(G, SIXTEENTH);
        play(G, SIXTEENTH);
        play(2*D, QUARTER);
        play(2*C, EIGHTH);

        play(2*C, QUARTER+EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);

        play(2*C, SIXTEENTH);
        play(2*C, SIXTEENTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*D, SIXTEENTH);
        play(2*D, SIXTEENTH);
        play(2*C, QUARTER);
    }

    public static void play27() throws InterruptedException {
        // (105)
        pause(QUARTER+EIGHTH);
        chord(2*D, B, EIGHTH);
        chord(2*D, B, SIXTEENTH);
        chord(2*C, A, SIXTEENTH);
        chord(2*D, B, EIGHTH);
        // 并发时莫名其妙数组越界，原因不明，故实际未并发

        play(2*D, EIGHTH);
        play(2*E, EIGHTH);
        play(2*D, EIGHTH);
        play(2*E, QUARTER);
        play(2*F, EIGHTH);

        chord(2*E, G, 3*QUARTER);

        pause(3*QUARTER);
    }

    public static void play28() throws InterruptedException {
        // (109)
        play(2*G, EIGHTH);
        play(2*G, EIGHTH);
        play(2*G, EIGHTH);
        play(2*G, EIGHTH);
        play(2*E, EIGHTH);
        play(2*D, EIGHTH);

        play(2*C, EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);

        play(2*E, QUARTER);
        play(2*D, EIGHTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(G, EIGHTH);

        play(A, QUARTER+EIGHTH);
        pause(QUARTER+EIGHTH);
    }

    public static void play29() throws InterruptedException {
        // (113)
        pause(QUARTER+EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);
        play(B, EIGHTH);

        play(2*C, EIGHTH);
        play(B, EIGHTH+SIXTEENTH);
        play(G, SIXTEENTH);
        play(G, EIGHTH);
        play(D, EIGHTH);
        play(E, EIGHTH);

        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(F, SIXTEENTH);
        play(G, QUARTER);
        play(F, SIXTEENTH);
        play(G, SIXTEENTH);

        play(A, QUARTER);
        play(A, SIXTEENTH);
        play(B, SIXTEENTH);
        play(2*C, QUARTER);
        play(2*D, SIXTEENTH);
        play(2*C, SIXTEENTH);
    }

    public static void play30() throws InterruptedException {
        // (117)
        play(G, QUARTER+EIGHTH);
        play(G, EIGHTH);
        play(F, EIGHTH);
        play(F, EIGHTH);

        play(E, QUARTER);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(G, QUARTER+EIGHTH);

        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, SIXTEENTH);
        play(D, SIXTEENTH);
        play(E, EIGHTH);
        play(G, QUARTER);
        play(F, SIXTEENTH);
        play(G, SIXTEENTH);

        play(A, QUARTER);
        pause(SIXTEENTH);
        play(A, SIXTEENTH);
        play(B, QUARTER);
        pause(SIXTEENTH);
        play(E, SIXTEENTH);
    }

    public static void play31() throws InterruptedException {
        // (121)
        play(2*E, EIGHTH);
        play(2*E, EIGHTH+SIXTEENTH);
        play(2*E, SIXTEENTH);
        play(2*F, EIGHTH);
        play(2*E, EIGHTH);
        play(2*D, EIGHTH);

        play(2*D, QUARTER);
        play(2*C, SIXTEENTH);
        play(B, SIXTEENTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*D, QUARTER);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, EIGHTH);

        play(2*D, QUARTER);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);
    }

    public static void play32() throws InterruptedException {
        // (125)
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, EIGHTH);
        play(2*C, QUARTER);
        play(G, SIXTEENTH);
        play(2*C, SIXTEENTH);

        play(2*D, EIGHTH+SIXTEENTH);
        play(2*E, SIXTEENTH);
        play(2*D, EIGHTH);
        play(2*C, QUARTER);
        play(2*C, EIGHTH);

        play(B, EIGHTH);
        play(A, EIGHTH);
        play(A, EIGHTH);
        play(A, QUARTER);
        play(G, EIGHTH);

        play(G, QUARTER);
        play(F, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(E, 3*QUARTER);
    }

    public static void play33() throws InterruptedException {
        // (130)
        play(E, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(F, EIGHTH);
        play(E, EIGHTH);
        play(D, EIGHTH);

        play(C, 3*QUARTER);

        play(F, EIGHTH);
        play(F, QUARTER);
        play(G, QUARTER);
        play(2*C, EIGHTH);

        play(2*C, 3*QUARTER);

        play(2*C, EIGHTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*D, EIGHTH);
        play(2*C, EIGHTH);
        play(2*D, EIGHTH);
        chord(2*C, 2*C, 3*QUARTER);
    }
}
