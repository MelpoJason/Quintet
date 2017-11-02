import { Injectable } from '@angular/core';
import 'rxjs/add/operator/toPromise'

@Injectable()
export class HomepageService {

  constructor() { }

  getHomepageInfo(): Promise<any>{
    return Promise.resolve();
  }
}
