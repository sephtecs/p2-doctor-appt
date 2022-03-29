import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppendingAppointmentsComponent } from './kamis/appending-appointments/appending-appointments.component';
import { BookAppointmentComponent } from './kamis/book-appointment/book-appointment.component';
import { DoctorHomeComponent } from './kamis/doctor-home/doctor-home.component';
import { DoctorInfoComponent } from './kamis/doctor-info/doctor-info.component';
import { KamisComponent } from './kamis/kamis.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { PatientInfoComponent } from './kamis/patient-info/patient-info.component';
import { HomeComponent } from './home/home.component';
import { AppointmenListComponent } from './appointmen-list/appointmen-list.component';



const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'patientInfo', component : PatientInfoComponent},
  { path: 'doctorInfo', component : DoctorInfoComponent},
  { path: 'viewAppendingApp', component : AppendingAppointmentsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'bookAppointment', component : BookAppointmentComponent},
  { path: 'findDoctor', component : KamisComponent},
  { path: 'doctorHome', component : DoctorHomeComponent},
  { path: '', component : HomeComponent},
  { path: 'appointment-list', component : AppointmenListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }