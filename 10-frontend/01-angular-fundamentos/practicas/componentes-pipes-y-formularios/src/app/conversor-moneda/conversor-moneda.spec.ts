import { TestBed } from '@angular/core/testing';
import { ConversorMoneda } from './conversor-moneda';

describe('ConversorMoneda', () => {
  it('se crea y muestra el formulario', async () => {
    await TestBed.configureTestingModule({ imports: [ConversorMoneda] }).compileComponents();
    const fixture = TestBed.createComponent(ConversorMoneda);
    fixture.detectChanges();
    const formulario = fixture.nativeElement.querySelector('form');
    expect(formulario).toBeTruthy();
  });
});
