package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.io.File;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.Filesystem;
import swervelib.parser.SwerveParser;
import swervelib.SwerveDrive;

public class Swerve_Subsystem extends SubsystemBase {
  File swerveJsonDirectory = new File(Filesystem.getDeployDirectory(),"swerve");

  private final SwerveDrive Swerve;
  
  public Swerve_Subsystem() {
    try {Swerve = new SwerveParser(swerveJsonDirectory).createSwerveDrive();}
    catch (Exception e) {throw new RuntimeException(e);}
  }

  public void Drive_Swerve(Translation2d Translation, double Rotation) {
    Swerve.drive(Translation, Rotation, true, false);
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
}
