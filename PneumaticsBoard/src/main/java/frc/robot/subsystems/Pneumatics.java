// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {

  public DoubleSolenoid piston;
  /** Creates a new Pneumatics. */
  public Pneumatics(DoubleSolenoid piston) {
    this.piston = piston;
  }

  public void forward(){
    piston.set(DoubleSolenoid.Value.kForward);
  }  

  public void reverse(){
    piston.set(DoubleSolenoid.Value.kReverse);
  }  

  public DoubleSolenoid getDoubleSolenoid(){
    return piston;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
