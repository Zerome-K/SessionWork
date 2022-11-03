package queueAssignment;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class InterviewPanel {
    private final ArrayDeque<String> waitingCandidates = new ArrayDeque<>();
    private  ArrayBlockingQueue<String> inProgress ;
    private final Scanner scanner = new Scanner(System.in);
    public void init() {
        System.out.println("""
                    1.ADD CANDIDATE
                    2.INTERVIEW CANDIDATE
                    3.VIEW WAITING LIST
                    4.VIEW IN PROGRESS CANDIDATES""");
        byte option = scanner.nextByte();
        if(option == 1) addCandidate();
        else if(option == 2){
            if(inProgress.isEmpty()) System.out.println("--NO CANDIDATES FOUND--");
            else evaluateCandidate();
        }else if(option == 3) System.out.println(waitingCandidates);
        else if (option == 4) System.out.println(inProgress);
        else return;
        init();
    }
    private void evaluateCandidate() {
        String name = inProgress.poll();
        System.out.println(name + "-COMPLETED INTERVIEW");
        if (!waitingCandidates.isEmpty()) {
            String moved = waitingCandidates.pollFirst();
            inProgress.offer(moved);
            System.out.println(moved + "-MOVED TO INTERVIEW SLOT");
        }
    }
    private void addCandidate() {
        System.out.print("ENTER NAME : ");
        String name = scanner.next();
        if (inProgress.offer(name)) {
            System.out.println("READY FOR INTERVIEW");
        } else {
            waitingCandidates.offer(name);
            System.out.println("!INTERVIEW SLOT FULL PLEASE WAIT");
        }
    }
    private void capacity() {
        System.out.print("ENTER CABIN CAPACITY : ");
        int capacity = scanner.nextInt();
        inProgress = new ArrayBlockingQueue<>(capacity);
    }
    public static void main(String[] args) {
        InterviewPanel ip = new InterviewPanel();
        ip.capacity();
        ip.init();
    }
}
