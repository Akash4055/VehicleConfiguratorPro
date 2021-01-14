import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { VarinatSelectionComponent } from './varinat-selection/varinat-selection.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"variant",component:VarinatSelectionComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
