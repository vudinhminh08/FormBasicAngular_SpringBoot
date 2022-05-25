import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) { }
  getUsers() {

    this.http.get<User>('http://localhost:8081/api/users').subscribe(data => {

    })
  }
}
