// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Pneumatics;


public class PneumaticsCommand extends CommandBase {
  /** Creates a new PneumaticsCommand. */
  private final Pneumatics pneu;
  private final Joystick joy;

  public PneumaticsCommand(Pneumatics pneu, Joystick joy) {
    this.pneu = pneu;
    this.joy = joy;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(joy.getRawButton(Constants.joyA)){
      pneu.forward();
    } else if(joy.getRawButton(Constants.joyB)){
      pneu.reverse();
    } else if(joy.getRawButton(Constants.joyX)){
      pneu.setSingle(true);
    } else if(joy.getRawButton(Constants.joyY)){
      pneu.setSingle(false);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
