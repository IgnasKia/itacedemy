import { Component } from '@angular/core';
import {CounterService} from './counter.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello-angular';

  constructor (private counterService: CounterService){

  }

  addOne(): void {
    this.counterService.plus();
  }

  
}
