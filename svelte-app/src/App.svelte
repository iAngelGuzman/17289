<script>
	import Hijo from './Hijo.svelte';
	let contador = 0;
	function incrementar() {
		contador += 1;
	}
	let nombre;
	function saludar() {
		alert(nombre ? nombre : 'hola nulo');
	}
</script>

<main>
	<h1>Contar {contador}</h1>
	<button on:click={incrementar}>Incrementar</button>
	<Hijo text="Guardar" />
	<Hijo text="Borrar" color="red" />
	<input type="text" placeholder="Tu nombre" bind:value={nombre} />
	<button on:click={saludar}>Saludar</button>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>