import { Injectable } from '@angular/core';
import {HEROES} from "./mock-heroes";
import {Hero} from "./hero";

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  constructor() { }
  getHeroes():Hero[]{
    return HEROES;
  }
}
