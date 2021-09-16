import java.util.*;

class Process implements Comparable<Process>
{
    private int process_id;
    private String process_name;
    private int duration;
    private  int arrival_time;
    private int turnaround_time; 

    public Process(int process_id, String process_name, int duration, int arrival_time) {
        this.process_id = process_id;
        this.process_name = process_name;
        this.duration = duration;
        this.arrival_time = arrival_time;
        this.turnaround_time = 0;
    }

    public int getProcess_id() { return process_id; }
    public void setProcess_id(int process_id) { this.process_id = process_id; }

    public String getProcess_name() { return process_name; }
    public void setProcess_name(String process_name) { this.process_name = process_name; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getArrival_time() { return arrival_time; }
    public void setArrival_time(int arrival_time) { this.arrival_time = arrival_time; }

    public int getTurnaround_time() { return turnaround_time; }
    public void setTurnaround_time(int turnaround_time) { this.turnaround_time = turnaround_time; }


    // Compare two process objects by their arrival_time
    @Override
    public int compareTo(Process process) {
        if(this.getArrival_time() > process.getArrival_time()) {
            return 1;
        } else if (this.getArrival_time() < process.getArrival_time()) {
            return -1;
        } else {
            return 0;
        }
    }

}



public class FCFS {
    public static int timer = 0;
    public static PriorityQueue<Process>readyQ = new PriorityQueue<>();
    public static PriorityQueue<Process>inQ = new PriorityQueue<>();

    public void simulate()
    {
        int n;
        int process_id;
        String process_name;
        int duration;
        int arrival_time;

        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n = sc.nextInt();
        System.out.println();

        for(int i = 1; i<= n; i++)
        {
            System.out.print("ID:");
            process_id = sc.nextInt();


            sc.nextLine();// buffer flush..

            System.out.print("Name:");
            process_name = sc.nextLine();

            System.out.print("Duration:");
            duration = sc.nextInt();

            System.out.print("Arrival:");
            arrival_time = sc.nextInt();

            Process newProcess =  new Process(process_id, process_name, duration,  arrival_time);

            readyQ.add(newProcess);
            System.out.println();
        }

        while(!readyQ.isEmpty())
        {
            Process p = readyQ.remove();

            timer += p.getDuration();
            p.setTurnaround_time(timer - p.getArrival_time());
           
            inQ.add(p);
        }

        Iterator iterator = inQ.iterator();

        int timeline = 0;
        int qSize = inQ.size();
        int total_time = 0;

        for(int i = 1; iterator.hasNext(); i++) {
            Process a_process = (Process) iterator.next();

            String pname = a_process.getProcess_name();
            int pduration = a_process.getDuration();
            int parrival = a_process.getArrival_time();
            int pturnaround = a_process.getTurnaround_time();

            System.out.print(i + "\t");
            System.out.print(pname + "\t");
            System.out.print(timeline+"-" + (timeline+pduration)+"\t\t");
            System.out.println(pturnaround + "\n");

            timeline += pduration;
            total_time += pturnaround;
        }

        System.out.print("Average Turnaround Time (ATT) = ");
        float att = (float)total_time/qSize;
        System.out.printf("%.2f", att);

        System.out.println("\n\n\n");

    }

    public static void main(String[] args) {

        FCFS fcfs = new FCFS();

        while(true)
        {
            try {
                fcfs.simulate();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }

}