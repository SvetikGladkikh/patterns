package net.lesson14.exercise4;

public class HistoryServiceWithRequirements extends HistoryServiceDecorator {
    public HistoryServiceWithRequirements(HistoryService historyService) {
        super(historyService);
    }

    @Override
    public void createRequest() {
        startOperation("create request");
        super.createRequest();
        stopOperation("create request");
    }

    @Override
    public void getRequest() {
        startOperation("get request");
        super.getRequest();
        stopOperation("get request");
    }

    @Override
    public void updateRequest() {
        startOperation("update request");
        super.updateRequest();
        stopOperation("update request");
    }

    private void startOperation(String operation) {
        AuditService.sendEvent("start " + operation);
        LogService.sendEvent("start " + operation);
        MonitoringService.sendEvent("start " + operation);
    }

    private void stopOperation(String operation) {
        AuditService.sendEvent("stop " + operation);
        LogService.sendEvent("stop " + operation);
        MonitoringService.sendEvent("stop " + operation);
    }
}
