package frc.robot;

import frc.robot.Constants.Operator_Constants;
import frc.robot.commands.Drive_Swerve;
import frc.robot.subsystems.Swerve_Subsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  private final Swerve_Subsystem m_exampleSubsystem = new Swerve_Subsystem();

  private final CommandXboxController m_driverController = new CommandXboxController(Operator_Constants.kDriverControllerPort);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
