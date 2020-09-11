import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Shoe } from '../shoe';
import { ShoeService } from '../shoe.service';

@Component({
  selector: 'app-delete-shoe',
  templateUrl: './delete-shoe.component.html',
  styleUrls: ['./delete-shoe.component.css']
})
export class DeleteShoeComponent implements OnInit {

  private shoe:Shoe;
  constructor(private shoeService:ShoeService,private router:Router) {
    this.shoe=new Shoe();
   }

   public deleteShoe():void{
     this.shoeService.deleteShoe(this.shoe).subscribe(res=>{
       this.shoe=new Shoe();
       this.router.navigate(['/deleteShoe']);
     }
      )
   }

  ngOnInit() {
  }

}