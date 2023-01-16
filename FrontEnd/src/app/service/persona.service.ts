import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { persona } from '../model/persona.model';


@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = environment.URL + 'personas/';
  
  constructor(private httpClient : HttpClient) { }

/*public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL+ 'traer/perfil');
  } */


public lista(): Observable<persona[]>{
  return this.httpClient.get<persona[]>(this.URL + 'lista');
}

public detail(id: number): Observable<persona>{
  return this.httpClient.get<persona>(this.URL + `detail/${id}`);
}

/*public save(educacion: Educacion): Observable<any>{
  return this.httpClient.post<any>(this.URL + 'create', educacion);
}*/

public update(id: number, Persona: persona): Observable<any>{
  return this.httpClient.put<any>(this.URL + `update/${id}`, Persona);
}

/*public delete(id: number): Observable<any>{
  return this.httpClient.delete<any>(this.URL + `delete/${id}`);
}*/

}