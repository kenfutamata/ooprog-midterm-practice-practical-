public class DemoRunners {
    public static void main(String[] args) {
        Machine M = new Machine();
        Athlete A = new Athlete();
        PoliticalCandidate PC = new PoliticalCandidate();

        M.run();
        System.out.println();
        A.run();
        System.out.println();
        PC.run();
    }
}
