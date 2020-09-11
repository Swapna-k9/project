import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddShoeComponent } from './add-shoe/add-shoe.component';
import { ShoesListComponent } from './shoes-list/shoes-list.component';
import { UpdateShoeComponent } from './update-shoe/update-shoe.component';
import { SearchShoeComponent } from './search-shoe/search-shoe.component';
import { DeleteShoeComponent } from './delete-shoe/delete-shoe.component';
import { ShoeService } from './shoe.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    AddShoeComponent,
    ShoesListComponent,
    UpdateShoeComponent,
    SearchShoeComponent,
    DeleteShoeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ShoeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
