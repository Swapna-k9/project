import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Shoe } from '../shoe';
import { ShoeService } from '../shoe.service';

@Component({
  selector: 'app-update-shoe',
  templateUrl: './update-shoe.component.html',
  styleUrls: ['./update-shoe.component.css']
})
export class UpdateShoeComponent implements OnInit {

  private shoe:Shoe;
  constructor(private shoeService:ShoeService,private router:Router) {
    this.shoe=new Shoe();
   }

   public updateShoe():void{
     this.shoeService.updateShoe(this.shoe).subscribe(res=>{
       this.shoe=new Shoe();
       this.router.navigate(['/updateShoe']);
     }
      )
   }

  ngOnInit() {
  }

}
