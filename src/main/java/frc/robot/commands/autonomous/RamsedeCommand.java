/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;

public class RamsedeCommand extends InstantCommand {

  private DriveSubsystem m_driveSubsystem;

  private Command m_autonomousCommand;
  private int commandid;

  /**
   * Creates a new AutonomousCommand.
   */
  public RamsedeCommand(int command_ID) {
    commandid = command_ID;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_autonomousCommand = RobotContainer.getAutonomousCommand(commandid);

    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }    
  }
}
