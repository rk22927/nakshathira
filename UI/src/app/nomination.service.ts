import { Component,Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class NominationService {


  constructor(private httpClient: HttpClient) { }

  public createCustomer(data : any) {
    return this.httpClient.post<any>("/api/v1/myself/save", data);
  }
  
  public createSomebody(data : any) {
    return this.httpClient.post<any>("/api/v1/somebody/save", data);
  }
  
  
}
