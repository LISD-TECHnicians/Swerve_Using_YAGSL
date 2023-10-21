package frc.robot.commands;

import frc.robot.subsystems.Swerve_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Drive_Swerve extends CommandBase {
  private final Swerve_Subsystem SwerveSubsystem;

  public Drive_Swerve(Swerve_Subsystem SwerveSubsystem) {
    this.SwerveSubsystem = SwerveSubsystem;

    addRequirements(SwerveSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
