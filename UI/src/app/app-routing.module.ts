import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { YourselfComponent } from './yourself/yourself.component';
import { SomebodyComponent } from './somebody/somebody.component';

const routes: Routes = [
  {
    path: 'yourself',
    component: YourselfComponent
  },
  {
    path: 'somebody',
    component: SomebodyComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
