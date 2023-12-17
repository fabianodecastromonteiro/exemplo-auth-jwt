import { Component, OnInit } from '@angular/core';
import { APP_CONFIG } from 'src/app/config/app.config';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  getAppUri() {
    return (`${APP_CONFIG.aprUri}`);
  }

}
