package frc.robot.Subsystems;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class VisionSys extends SubsystemBase {
    NetworkTable table;

    public VisionSys() {
        table = NetworkTableInstance.getDefault().getTable("limelight");
    }

    public Pose3d getPosition() {
        double[] position = table.getEntry("botpose").getDoubleArray(new double[6]);
        Rotation3d angle = new Rotation3d(position[3], position[4], position[5]);
        Pose3d pose = new Pose3d(position[0], position[1], position[2], angle);
        return pose;
    }
}
