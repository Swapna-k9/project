import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddShoeComponent } from './add-shoe/add-shoe.component';
import { DeleteShoeComponent } from './delete-shoe/delete-shoe.component';
import { SearchShoeComponent } from './search-shoe/search-shoe.component';
import { ShoesListComponent } from './shoes-list/shoes-list.component';
import { UpdateShoeComponent } from './update-shoe/update-shoe.component';


const routes: Routes = [
  {path:'addShoe',component:AddShoeComponent},
  {path:'deleteShoe',component:DeleteShoeComponent},
  {path:'searchShoe',component:SearchShoeComponent},
  {path:'updateShoe',component:UpdateShoeComponent},
  {path:'shoesList',component:ShoesListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
