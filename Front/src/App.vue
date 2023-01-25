<template>
<div>
  <primeiro-componente/>
  <p>o dado de app é: {{ testando }}</p>
<Life-Cycle/>
<api/>
</div>
</template>

<script>
import PrimeiroComponente from './components/PrimeiroComponente.vue'
import LifeCycle from './components/LifeCycle.vue'
import api from './services/api'

export default {
 name: 'App',
 components: {
  PrimeiroComponente,
  LifeCycle
 },

data() {
  return {
    testando: 'Teste'
  }
}
}
</script>


