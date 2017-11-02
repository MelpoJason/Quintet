import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {HomepageService} from "../../service/homepage.service";

@Component({
  selector: 'app-homepage',
  templateUrl: 'homepage.component.html',
  styleUrls: ['homepage.component.scss']
})
export class HomepageComponent implements OnInit {

  constructor(private router: Router, private homepageService : HomepageService) {
  }

  ngOnInit() {
  }



}
