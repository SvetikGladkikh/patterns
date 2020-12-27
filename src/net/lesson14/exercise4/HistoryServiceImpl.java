package net.lesson14.exercise4;

public class HistoryServiceImpl implements HistoryService {

    @Override
    public void createRequest() {
        System.out.println("create Request");
    }

    @Override
    public void updateRequest() {
        System.out.println("update Request");
    }

    @Override
    public void getRequest() {
        System.out.println("get Request");
    }
}
