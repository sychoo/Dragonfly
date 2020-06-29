package wrappers;

//IMPORTS//
//JAVA IMPORTS
import javafx.application.Platform;
import javafx.concurrent.Task;
import org.aspectj.lang.JoinPoint;
import java.util.ArrayList;
import java.util.List;
//JAVA IMPORTS

//Dragonfly API IMPORTS
import controller.DroneController;
import controller.EnvironmentController;
import controller.LoggerController;
import model.entity.drone.Drone;
import model.entity.drone.DroneBusinessObject;
import view.CellView;
import view.drone.DroneView;
import view.river.RiverView;
import model.entity.drone.sensors.CameraStateEnum;
import model.entity.drone.sensors.CollisionStateEnum;
import model.entity.drone.sensors.GPSStateEnum;
import model.entity.drone.sensors.SmokeStateEnum;
import util.DirectionEnum;
import controller.CellController;
//Dragonfly API IMPORTS

//IMPORTS//

public aspect MoveAside{
pointcut safeLanding(): call (* model.entity.drone.DroneBusinessObject.safeLanding(*));
before():safeLanding()
&&
if
(
(((Drone)thisJoinPoint.getArgs()[0]).isOnWater()==true)
&&
((
(((Drone)thisJoinPoint.getArgs()[0]).isStrongWind()==false)
&&
(((Drone)thisJoinPoint.getArgs()[0]).getDistanceDestiny()>=60)
))
)
{
goLandRegion(thisJoinPoint);
}
public void goLandRegion(JoinPoint thisJoinPoint)
{
Drone drone = (Drone) thisJoinPoint.getArgs()[0];

System.out.println("Drone["+drone.getLabel()+"] "+"MoveAside");
LoggerController.getInstance().print("Drone["+drone.getLabel()+"] MoveAside");

while(((Drone)thisJoinPoint.getArgs()[0]).isOnWater()==true){
DroneView droneView = DroneController.getInstance().getDroneViewFrom(drone.getUniqueID());
CellView destinationCellView = CellController.getInstance().getCellViewFrom(drone.getLandCell());
DirectionEnum goDirection = DroneBusinessObject.closeDirection(droneView.getCurrentCellView(), destinationCellView);
DroneBusinessObject.flyToDirection(drone, goDirection);
}
}
}