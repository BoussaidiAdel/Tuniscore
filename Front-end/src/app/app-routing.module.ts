import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ContactComponent } from './contact/contact.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { AuthGuard } from './auth.guard';
const routes: Routes = [{path:'Home',component: HomeComponent},
                        { path: '', redirectTo: 'Home', pathMatch: 'full' },
                        {path:'contact',component:ContactComponent},
                        {path:'signin',component:SignInComponent},
                        {path:'signup',component:SignUpComponent},
                        {path:'**',component:NotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
