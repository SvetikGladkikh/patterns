package net.lesson14.exercise4;

public class HistoryServiceDecorator implements HistoryService {

    HistoryService historyService;

    public HistoryServiceDecorator(HistoryService historyService) {
        this.historyService = historyService;
    }

    @Override
    public void createRequest() {
        this.historyService.createRequest();
    }

    @Override
    public void getRequest() {
        this.historyService.getRequest();
    }

    @Override
    public void updateRequest() {
        this.historyService.updateRequest();
    }
}
