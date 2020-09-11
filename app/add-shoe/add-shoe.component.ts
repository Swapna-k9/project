import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Shoe } from '../shoe';
import { ShoeService } from '../shoe.service';

@Component({
  selector: 'app-add-shoe',
  templateUrl: './add-shoe.component.html',
  styleUrls: ['./add-shoe.component.css']
})
export class AddShoeComponent implements OnInit {

  private shoe:Shoe;
  constructor(private shoeService:ShoeService,private router:Router) {
    this.shoe=new Shoe();
   }

   public addShoe():void{
     this.shoeService.addShoe(this.shoe).subscribe(res=>{
       this.shoe=new Shoe();
       this.router.navigate(['/shoesList']);
     }
      )
   }

  ngOnInit() {
  }

}
