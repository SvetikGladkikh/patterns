package net.lesson14.exercise4;

public class Runner {
    public static void main(String args[]) {
        HistoryService historyService = new HistoryServiceWithRequirements(new HistoryServiceImpl());

        historyService.createRequest();
        historyService.updateRequest();
        historyService.getRequest();
    }
}
