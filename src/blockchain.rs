        use crate::block::Block;
        use chrono::Utc;
        pub struct Blockchain { pub chain: Vec<Block>, pub difficulty: usize,
        }
        impl Blockchain {
        pub fn new(difficulty: usize) -> Blockchain { Blockchain {
        chain: vec![Blockchain::create_genesis_block()], difficulty,
        }
        }
        pub fn create_genesis_block() -> Block { Block {
        index: 0,
        previous_hash: "0".to_string(), timestamp: 0,
        data: "Genesis Block".to_string(), nonce: 0,
        hash: String::new(),
        }
        }
        pub fn add_block(Cmut self, data: String) {
        let previous_block = self.chain.last().unwrap(); let mut new_block = Block {
        index: self.chain.len() as u32,
        previous_hash: previous_block.hash.clone(), timestamp: Utc::now().timestamp() as u64, data,
        nonce: 0,
        hash: String::new(),
        };
        new_block.mine_block(self.difficulty); self.chain.push(new_block);
        }
        }