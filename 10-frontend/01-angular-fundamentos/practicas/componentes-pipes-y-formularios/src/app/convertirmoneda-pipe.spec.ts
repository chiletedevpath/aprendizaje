import { ConvertirmonedaPipe } from './convertirmoneda-pipe';

describe('ConvertirmonedaPipe', () => {
  const pipe = new ConvertirmonedaPipe();

  it('convierte soles a dólares con la tasa indicada', () => {
    expect(pipe.transform(380, 3.8)).toMatch(/100[.,]00/);
  });

  it('valida el monto', () => {
    expect(pipe.transform(null, 3.8)).toBe('Monto no válido');
  });
});
