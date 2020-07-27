package model.entity;

import controller.CellController;
import model.Cell;

import java.util.ArrayList;
import java.util.List;

public class House {
    public static int COUNT_HOUSE = 1;
    private String uniqueID;
    int rowPosition, columnPosition;
    private Boolean selected = false;
    private List<Listener> listeners = new ArrayList<>();
    private String label;
    private Double height = 0.D;
    private Double distanceSource;

    private Cell sourceCell = CellController.getInstance().getCellFrom(0,0);

    public House(String uniqueID, String label, int rowPosition, int columnPosition, Cell sourceCell) {
        this.uniqueID = uniqueID;
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
        this.label = label;
        this.sourceCell = sourceCell;
        COUNT_HOUSE++;
    }

    public String getLabel() {
        return label;
    }

    public interface Listener{
        public void onChange(House house, String methodName, Object oldValue, Object newValue);
    }

    public static void restartCount() {
        COUNT_HOUSE = 1;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        String oldValue = this.uniqueID;
        String newValue = uniqueID;

        if(oldValue == newValue){
            return;
        }

        this.uniqueID = uniqueID;

        notifiesListeners(Thread.currentThread().getStackTrace()[1].getMethodName(),oldValue, newValue);
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        boolean oldValue = this.selected;
        boolean newValue = selected;

        this.selected = selected;

        notifiesListeners(Thread.currentThread().getStackTrace()[1].getMethodName(),oldValue, newValue);
    }

    public Double getHeight(){ return height; }

    public void setHeight(Double height){
        Double oldValue = this.height;
        Double newValue = height;

        if(oldValue == newValue){
            return;
        }

        this.height = height;

        notifiesListeners(Thread.currentThread().getStackTrace()[1].getMethodName(),oldValue, newValue);
    }

    public Cell getSourceCell() {
        return sourceCell;
    }

    public void setSourceCell(Cell sourceCell) {
        Cell oldValue = this.sourceCell;
        Cell newValue = sourceCell;

        this.sourceCell = sourceCell;

        if(oldValue == newValue){
            return;
        }

        notifiesListeners(Thread.currentThread().getStackTrace()[1].getMethodName(),oldValue, newValue);
    }

    public Double getDistanceSource() {
        return distanceSource;
    }

    public void setDistanceSource(Double distanceSource) {
        Double oldValue = this.distanceSource;
        Double newValue = distanceSource;

        if(oldValue == newValue){
            return;
        }

        this.distanceSource = distanceSource;

        notifiesListeners(Thread.currentThread().getStackTrace()[1].getMethodName(),oldValue, newValue);
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }
    private void notifiesListeners(String attributeName, Object oldValue, Object newValue){

        synchronized (this){
            for (Listener listener : listeners){
                listener.onChange(this, attributeName, oldValue, newValue);
            }
        }
    }
}
